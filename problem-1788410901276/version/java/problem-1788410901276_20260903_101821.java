// Last updated: 9/3/2026, 10:18:21 AM
1class Solution {
2    public int minOperations(int[] nums, int sum) {
3        int INF=1000000;
4        int[]dp=new int[sum+1];
5        java.util.Arrays.fill(dp,INF);
6        dp[0]=0;
7        for(int x:nums){
8            int[]ndp=dp.clone();
9            int v=x,op=0;
10            while(v>0){
11                if(v<=sum)
12                for(int s=0;s+v<=sum;s++)
13                if(dp[s]!=INF)
14                ndp[s+v]=Math.min(ndp[s+v],dp[s]+op);
15                v/=2;
16                op++;
17            }
18            v=x;
19            op=0;
20            while(v<=sum){
21                for(int s=0;s+v<=sum;s++)
22                if(dp[s]!=INF)
23                ndp[s+v]=Math.min(ndp[s+v],dp[s]+op);
24                v*=2;
25                op++;
26            }
27            dp=ndp;
28        }
29        return dp[sum]==INF ?-1:dp[sum];
30    }
31}