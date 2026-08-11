// Last updated: 8/11/2026, 8:31:01 PM
1class Solution {
2    public int[][] transpose(int[][] matrix) {
3        int m = matrix.length;       // number of rows
4        int n = matrix[0].length;    // number of columns
5        int[][] result = new int[n][m]; // transposed matrix
6
7        for (int i = 0; i < m; i++) {
8            for (int j = 0; j < n; j++) {
9                result[j][i] = matrix[i][j];
10            }
11        }
12        return result;
13    }
14}
15