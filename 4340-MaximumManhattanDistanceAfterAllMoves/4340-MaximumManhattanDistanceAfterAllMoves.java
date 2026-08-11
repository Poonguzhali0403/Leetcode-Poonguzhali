// Last updated: 8/11/2026, 2:13:42 PM
class Solution {
    public int maxDistance(String moves) {
        int up=0, down=0,left=0,right=0,wild=0;
        for(char ch:moves.toCharArray()){
        if(ch=='U')up++;
        else if(ch=='D')down++;
        else if(ch=='L')left++;
        else if(ch=='R')right++;
        else wild++;//'_'
    }
    int x=right-left;
    int y=up-down;
    return Math.abs(x)+Math.abs(y)+wild;

}
}