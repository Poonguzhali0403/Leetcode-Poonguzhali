// Last updated: 8/11/2026, 2:15:09 PM
import java.util.*;

class Solution {
    public int[] gridIllumination(int n, int[][] lamps, int[][] queries) {
        Map<Integer, Integer> rowCount = new HashMap<>();
        Map<Integer, Integer> colCount = new HashMap<>();
        Map<Integer, Integer> diagCount = new HashMap<>();
        Map<Integer, Integer> antiDiagCount = new HashMap<>();
        Set<Long> lampSet = new HashSet<>();

        // Step 1: Initialize lamps
        for (int[] lamp : lamps) {
            int r = lamp[0], c = lamp[1];
            long key = ((long) r << 32) + c; // unique key for (r,c)
            if (lampSet.contains(key)) continue; // avoid duplicates

            lampSet.add(key);
            rowCount.put(r, rowCount.getOrDefault(r, 0) + 1);
            colCount.put(c, colCount.getOrDefault(c, 0) + 1);
            diagCount.put(r - c, diagCount.getOrDefault(r - c, 0) + 1);
            antiDiagCount.put(r + c, antiDiagCount.getOrDefault(r + c, 0) + 1);
        }

        int[] ans = new int[queries.length];
        int[][] dirs = {{0,0},{0,1},{0,-1},{1,0},{-1,0},{1,1},{1,-1},{-1,1},{-1,-1}};

        // Step 2: Process queries
        for (int i = 0; i < queries.length; i++) {
            int r = queries[i][0], c = queries[i][1];

            // Check illumination
            if (rowCount.getOrDefault(r, 0) > 0 ||
                colCount.getOrDefault(c, 0) > 0 ||
                diagCount.getOrDefault(r - c, 0) > 0 ||
                antiDiagCount.getOrDefault(r + c, 0) > 0) {
                ans[i] = 1;
            } else {
                ans[i] = 0;
            }

            // Turn off lamp at (r,c) and its neighbors
            for (int[] d : dirs) {
                int nr = r + d[0], nc = c + d[1];
                long key = ((long) nr << 32) + nc;
                if (lampSet.contains(key)) {
                    lampSet.remove(key);
                    rowCount.put(nr, rowCount.get(nr) - 1);
                    colCount.put(nc, colCount.get(nc) - 1);
                    diagCount.put(nr - nc, diagCount.get(nr - nc) - 1);
                    antiDiagCount.put(nr + nc, antiDiagCount.get(nr + nc) - 1);
                }
            }
        }

        return ans;
    }
}
