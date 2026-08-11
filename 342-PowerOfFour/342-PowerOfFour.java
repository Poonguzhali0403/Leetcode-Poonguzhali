// Last updated: 8/11/2026, 2:15:59 PM
class Solution {
    public boolean isPowerOfFour(int n){
        if(n<1)
        return  false;
        if(n==1)
        return true;
        while(n%4==0)
        {
          n=n/4;
        }
if(n==1)
return true;
else
return false;
        
        
    
        
    }
}