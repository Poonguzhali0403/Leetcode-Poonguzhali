// Last updated: 8/11/2026, 2:13:44 PM
class Solution {
    public long maxSum(int[] nums, int k, int mul) {
        Arrays.sort(nums);
        long ans=0; 
        int idx=nums.length-1;
        for(int i=0;i<k;i++){
            int val= nums[idx--];
                if(mul>1){
                ans+=1L*val*mul;
                }
            else{
                ans+=val;
        }
        mul--;
        
    }
      return ans;
}
}