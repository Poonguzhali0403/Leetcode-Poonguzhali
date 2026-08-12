// Last updated: 8/12/2026, 6:53:07 PM
1class Solution {
2    public int maxSubarraySumCircular(int[] nums) {
3        int total = 0;
4        int maxSum = nums[0], curMax = 0;
5        int minSum = nums[0], curMin = 0;
6
7        for (int num : nums) {
8            // Kadane’s for max subarray
9            curMax = Math.max(num, curMax + num);
10            maxSum = Math.max(maxSum, curMax);
11
12            // Kadane’s for min subarray
13            curMin = Math.min(num, curMin + num);
14            minSum = Math.min(minSum, curMin);
15
16            total += num;
17        }
18
19        // Case 1: Normal max subarray (Kadane’s result)
20        // Case 2: Circular max subarray = total - minSum
21        // Edge case: if all numbers are negative, maxSum is the answer
22        if (maxSum < 0) return maxSum;
23        return Math.max(maxSum, total - minSum);
24    }
25}
26