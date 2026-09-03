// Last updated: 9/3/2026, 9:14:32 AM
1class Solution {
2    public int kthSmallest(int[][] matrix, int k) {
3        int n = matrix.length;
4        int left = matrix[0][0];
5        int right = matrix[n - 1][n - 1];
6
7        while (left < right) {
8            int mid = left + (right - left) / 2;
9            int count = countLessEqual(matrix, mid);
10
11            if (count < k) {
12                left = mid + 1;
13            } else {
14                right = mid;
15            }
16        }
17        return left;
18    }
19
20    private int countLessEqual(int[][] matrix, int mid) {
21        int n = matrix.length;
22        int count = 0;
23        int row = n - 1, col = 0;
24
25        while (row >= 0 && col < n) {
26            if (matrix[row][col] <= mid) {
27                count += row + 1;
28                col++;
29            } else {
30                row--;
31            }
32        }
33        return count;
34    }
35}
36