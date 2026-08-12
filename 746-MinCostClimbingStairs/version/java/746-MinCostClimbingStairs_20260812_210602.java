// Last updated: 8/12/2026, 9:06:02 PM
1class Solution {
2    public int minCostClimbingStairs(int[] cost) {
3        int n = cost.length;
4        int[] dp = new int[n + 1]; // dp[i] = min cost to reach step i
5
6        dp[0] = 0; // starting before step 0
7        dp[1] = 0; // starting before step 1
8
9        for (int i = 2; i <= n; i++) {
10            dp[i] = Math.min(dp[i - 1] + cost[i - 1],
11                             dp[i - 2] + cost[i - 2]);
12        }
13
14        return dp[n]; // min cost to reach the top
15    }
16}
17