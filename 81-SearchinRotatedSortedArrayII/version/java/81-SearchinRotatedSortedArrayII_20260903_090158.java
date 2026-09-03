// Last updated: 9/3/2026, 9:01:58 AM
1class Solution {
2    public boolean search(int[] nums, int target) {
3        int left = 0, right = nums.length - 1;
4
5        while (left <= right) {
6            int mid = left + (right - left) / 2;
7
8            if (nums[mid] == target) {
9                return true;
10            }
11
12            // Handle duplicates
13            if (nums[left] == nums[mid] && nums[mid] == nums[right]) {
14                left++;
15                right--;
16            }
17            // Left half is sorted
18            else if (nums[left] <= nums[mid]) {
19                if (target >= nums[left] && target < nums[mid]) {
20                    right = mid - 1;
21                } else {
22                    left = mid + 1;
23                }
24            }
25            // Right half is sorted
26            else {
27                if (target > nums[mid] && target <= nums[right]) {
28                    left = mid + 1;
29                } else {
30                    right = mid - 1;
31                }
32            }
33        }
34
35        return false;
36    }
37}
38