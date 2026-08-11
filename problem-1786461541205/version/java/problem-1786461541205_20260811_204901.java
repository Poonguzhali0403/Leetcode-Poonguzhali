// Last updated: 8/11/2026, 8:49:01 PM
1class Solution {
2    public boolean checkStraightLine(int[][] coordinates) {
3        int x0 = coordinates[0][0], y0 = coordinates[0][1];
4        int x1 = coordinates[1][0], y1 = coordinates[1][1];
5
6        for (int i = 2; i < coordinates.length; i++) {
7            int x = coordinates[i][0], y = coordinates[i][1];
8            if ((y1 - y0) * (x - x0) != (y - y0) * (x1 - x0)) {
9                return false;
10            }
11        }
12        return true;
13    }
14}
15