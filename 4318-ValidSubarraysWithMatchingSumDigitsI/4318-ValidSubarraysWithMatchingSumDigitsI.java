// Last updated: 8/11/2026, 2:13:45 PM
class Solution {
    public int countValidSubarrays(int[] nums, int x) {
        int ans =0;
        for(int i=0;i<nums.length;i++){
            long sum=0;
            for(int j=i;j<nums.length;j++){
                sum += nums[j];
                long temp =sum;
                int last=(int)(temp % 10);
                while(temp>= 10){
                    temp/=10;
            }
            int first= (int)temp;
            if(first==x&& last==x){
                ans++;
            }
        }
    }
    return ans;
    }
}