// Last updated: 8/11/2026, 2:16:30 PM
import java.util.*;
class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<1)
        return  false;
        if(n==1)
        return true;
        while(n%2==0)
        {
          n=n/2;
        }
if(n==1)
return true;
else
return false;
        
    }
}