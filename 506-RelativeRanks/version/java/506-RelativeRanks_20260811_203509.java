// Last updated: 8/11/2026, 8:35:09 PM
1import java.util.*;
2
3class Solution {
4    public String[] findRelativeRanks(int[] score) {
5        int n = score.length;
6        String[] result = new String[n];
7
8        // Pair scores with their indices
9        int[][] arr = new int[n][2];
10        for (int i = 0; i < n; i++) {
11            arr[i][0] = score[i];
12            arr[i][1] = i;
13        }
14
15        // Sort by score descending
16        Arrays.sort(arr, (a, b) -> b[0] - a[0]);
17
18        // Assign ranks
19        for (int i = 0; i < n; i++) {
20            if (i == 0) {
21                result[arr[i][1]] = "Gold Medal";
22            } else if (i == 1) {
23                result[arr[i][1]] = "Silver Medal";
24            } else if (i == 2) {
25                result[arr[i][1]] = "Bronze Medal";
26            } else {
27                result[arr[i][1]] = String.valueOf(i + 1);
28            }
29        }
30
31        return result;
32    }
33}
34