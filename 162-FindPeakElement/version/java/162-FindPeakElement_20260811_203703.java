// Last updated: 8/11/2026, 8:37:03 PM
1class Solution {
2    public int findPeakElement(int[] nums) {
3        int left = 0, right = nums.length - 1;
4        
5        while (left < right) {
6            int mid = left + (right - left) / 2;
7            if (nums[mid] < nums[mid + 1]) {
8                left = mid + 1; // peak is on the right
9            } else {
10                right = mid; // peak is on the left (or at mid)
11            }
12        }
13        return left; // or right, both are same here
14    }
15}
16