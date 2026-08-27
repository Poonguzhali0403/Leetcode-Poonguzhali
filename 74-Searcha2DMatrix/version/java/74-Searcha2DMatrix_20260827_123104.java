// Last updated: 8/27/2026, 12:31:04 PM
1class Solution {
2    public boolean searchMatrix(int[][] matrix, int target) {
3        int m = matrix.length;
4        int n = matrix[0].length;
5
6        int left = 0, right = m * n - 1;
7
8        while (left <= right) {
9            int mid = left + (right - left) / 2;
10            int value = matrix[mid / n][mid % n];
11
12            if (value == target) {
13                return true;
14            } else if (value < target) {
15                left = mid + 1;
16            } else {
17                right = mid - 1;
18            }
19        }
20
21        return false;
22    }
23}
24