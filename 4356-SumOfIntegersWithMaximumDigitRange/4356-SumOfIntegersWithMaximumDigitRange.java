// Last updated: 8/11/2026, 2:13:40 PM
class Solution {
    public int maxDigitRange(int[] nums) {
        int maxrange=-1;
        int sum=0;
        for(int num:nums){
            int temp=num;
            int maxdigit=0;
            int mindigit=9;
            while(temp>0){
                int d= temp%10;
                maxdigit=Math.max(maxdigit,d);
                mindigit=Math.min(mindigit,d);
                temp/=10;
            }
        
            int range=maxdigit-mindigit;
            if(range>maxrange){
              maxrange=range;
              sum=num;
        }

            else if(range==maxrange){
              sum+=num;
        }
    }
        return sum;
}
}