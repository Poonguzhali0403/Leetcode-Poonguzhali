// Last updated: 8/11/2026, 2:16:02 PM
import java.util.*;
class Solution {
    public boolean isPowerOfThree(int n) {
        if(n<1)
        return  false;
        if(n==1)
        return true;
        while(n%3==0)
        {
          n=n/3;
        }
if(n==1)
return true;
else
return false;
        
    }
}