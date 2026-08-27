// Last updated: 8/27/2026, 12:30:05 PM
1class Solution {
2    public int[] searchRange(int[] nums, int target) {
3        int first = findBound(nums, target, true);
4        if (first == -1) return new int[]{-1, -1}; // target not found
5        int last = findBound(nums, target, false);
6        return new int[]{first, last};
7    }
8
9    private int findBound(int[] nums, int target, boolean isFirst) {
10        int left = 0, right = nums.length - 1, bound = -1;
11
12        while (left <= right) {
13            int mid = left + (right - left) / 2;
14
15            if (nums[mid] == target) {
16                bound = mid;
17                if (isFirst) {
18                    right = mid - 1; // keep searching left
19                } else {
20                    left = mid + 1; // keep searching right
21                }
22            } else if (nums[mid] < target) {
23                left = mid + 1;
24            } else {
25                right = mid - 1;
26            }
27        }
28
29        return bound;
30    }
31}
32