// Last updated: 9/3/2026, 9:13:39 AM
1class Solution {
2    public int singleNonDuplicate(int[] nums) {
3        int left = 0, right = nums.length - 1;
4
5        while (left < right) {
6            int mid = left + (right - left) / 2;
7
8            // Ensure mid is even
9            if (mid % 2 == 1) mid--;
10
11            if (nums[mid] == nums[mid + 1]) {
12                // Single element is to the right
13                left = mid + 2;
14            } else {
15                // Single element is to the left (including mid)
16                right = mid;
17            }
18        }
19
20        return nums[left];
21    }
22}
23