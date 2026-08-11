// Last updated: 8/11/2026, 2:17:20 PM
class Solution {
    public int singleNumber(int[] nums) {
        int i,x=0;
        for(i=0;i<nums.length;i++)
        
            x=x^nums[i];
            return x;
        
    }
        
    
}