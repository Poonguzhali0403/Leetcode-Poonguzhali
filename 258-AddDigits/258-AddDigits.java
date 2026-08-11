// Last updated: 8/11/2026, 2:16:23 PM
class Solution {
    public int addDigits(int num) {
        int d,n=num,sum=0;
        while(n>9)
        {
            sum=0;
            while(n!=0){
            
                d=n%10;
                sum=sum+d;
                n=n/10;
            }
            n =sum;
        
        }
return n;
        
    }
}