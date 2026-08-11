// Last updated: 8/11/2026, 9:18:52 PM
1class Solution {
2    public int areaOfMaxDiagonal(int[][] dimensions) {
3        double maxDiagonal = 0.0;
4        int maxArea = 0;
5
6        for (int[] rect : dimensions) {
7            int length = rect[0];
8            int width = rect[1];
9
10            // Step 1: Calculate diagonal using Pythagoras theorem
11            double diagonal = Math.sqrt(length * length + width * width);
12
13            // Step 2: Calculate area
14            int area = length * width;
15
16            // Step 3: Update if longer diagonal found
17            if (diagonal > maxDiagonal) {
18                maxDiagonal = diagonal;
19                maxArea = area;
20            } 
21            // Step 4: If diagonals are equal, choose larger area
22            else if (diagonal == maxDiagonal && area > maxArea) {
23                maxArea = area;
24            }
25        }
26
27        return maxArea;
28    }
29}
30