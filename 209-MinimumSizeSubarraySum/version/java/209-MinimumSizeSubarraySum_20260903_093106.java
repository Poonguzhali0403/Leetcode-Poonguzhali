// Last updated: 9/3/2026, 9:31:06 AM
1class Solution {
2    public int minSubArrayLen(int target, int[] nums) {
3        int left = 0;
4        int sum = 0;
5        int minLen = Integer.MAX_VALUE;
6
7        for (int right = 0; right < nums.length; right++) {
8            sum += nums[right];
9
10            while (sum >= target) {
11                minLen = Math.min(minLen, right - left + 1);
12                sum -= nums[left];
13                left++;
14            }
15        }
16
17        return (minLen == Integer.MAX_VALUE) ? 0 : minLen;
18    }
19}
20