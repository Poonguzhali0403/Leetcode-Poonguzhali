// Last updated: 8/11/2026, 2:16:19 PM
class Solution {
    public int missingNumber(int[] nums) {
        int sum=0,ans,i, x;
       int  n = nums.length;
        for(i=0;i<n;i++)
        sum+=nums[i];
        x=n*(n+1)/2;
        ans=x-sum;
        return ans;
        
    }
}