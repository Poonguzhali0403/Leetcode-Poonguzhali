// Last updated: 8/11/2026, 2:14:57 PM
class Solution {
    public int subtractProductAndSum(int n) {
        int sum=0,pro=1,d;
        while(n>0){
        d=n%10;
    
        pro*=d;
        sum+=d;

        n=n/10;
        }
 return pro -sum;
        
    }
}