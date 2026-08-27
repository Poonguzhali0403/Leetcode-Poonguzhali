// Last updated: 8/27/2026, 12:27:51 PM
1class Solution {
2    public int search(int[] nums, int target) {
3        int left = 0, right = nums.length - 1;
4
5        while (left <= right) {
6            int mid = left + (right - left) / 2;
7
8            if (nums[mid] == target) {
9                return mid;
10            }
11
12            // Left half is sorted
13            if (nums[left] <= nums[mid]) {
14                if (target >= nums[left] && target < nums[mid]) {
15                    right = mid - 1;
16                } else {
17                    left = mid + 1;
18                }
19            } 
20            // Right half is sorted
21            else {
22                if (target > nums[mid] && target <= nums[right]) {
23                    left = mid + 1;
24                } else {
25                    right = mid - 1;
26                }
27            }
28        }
29
30        return -1;
31    }
32}
33