// Last updated: 9/3/2026, 9:39:43 AM
1import java.util.*;
2
3class Solution {
4    public int maxFrequency(int[] nums, int k) {
5        Arrays.sort(nums);
6        long sum = 0;
7        int left = 0, result = 0;
8
9        for (int right = 0; right < nums.length; right++) {
10            sum += nums[right];
11
12            // Check if operations exceed k
13            while ((long) nums[right] * (right - left + 1) - sum > k) {
14                sum -= nums[left];
15                left++;
16            }
17
18            result = Math.max(result, right - left + 1);
19        }
20
21        return result;
22    }
23}
24