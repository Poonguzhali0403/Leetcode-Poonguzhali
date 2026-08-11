// Last updated: 8/11/2026, 2:14:16 PM
import java.util.*;
class Solution {
    public int numberOfCuts(int n) {
        int x=0;
        if(n>1){
        if(n%2==0)
        x=n/2;
        else
        x =n;
        }
        return x;
        

        
    }
}
