// Last updated: 8/11/2026, 2:17:36 PM

class Solution {
    public void sortColors(int[]nums){
        int c0=0,c1=0,c2=0;
        for(int n:nums){
            if(n==0)c0++;
            else if(n==1)c1++;
            else c2++;
        }
        int i=0;
        for(;i<c0;i++)nums[i]=0;
        for(;i<c0+c1;i++)nums[i]=1;
        for(;i<c0+c1+c2;i++)nums[i]=2;
        


        
    }
}