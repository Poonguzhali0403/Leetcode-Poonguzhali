// Last updated: 8/11/2026, 2:14:50 PM
class Solution {
    public int[] runningSum(int[] nums) {
        int n = nums.length;
        int i;
        for(i=1;i<n;i++)
       nums[i]=nums[i]+nums[i-1];
        return nums;
        
    }
}