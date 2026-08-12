// Last updated: 8/12/2026, 8:15:26 PM
1class Solution {
2    public char findTheDifference(String s, String t) {
3        int xor = 0;
4        
5        for (char c : s.toCharArray()) {
6            xor ^= c;
7        }
8        for (char c : t.toCharArray()) {
9            xor ^= c;
10        }
11        
12        return (char) xor;
13    }
14}
15