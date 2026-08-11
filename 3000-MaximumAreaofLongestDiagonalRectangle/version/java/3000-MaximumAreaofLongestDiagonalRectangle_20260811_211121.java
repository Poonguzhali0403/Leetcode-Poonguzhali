// Last updated: 8/11/2026, 9:11:21 PM
1class Solution {
2    public int areaOfMaxDiagonal(int[][] dimensions) {
3        double maxDiagonal = 0;
4        int maxArea = 0;
5
6        for (int[] rect : dimensions) {
7            int l = rect[0], w = rect[1];
8            double diagonal = Math.sqrt(l * l + w * w);
9            int area = l * w;
10
11            if (diagonal > maxDiagonal) {
12                maxDiagonal = diagonal;
13                maxArea = area;
14            } else if (diagonal == maxDiagonal && area > maxArea) {
15                maxArea = area;
16            }
17        }
18
19        return maxArea;
20    }
21}
22