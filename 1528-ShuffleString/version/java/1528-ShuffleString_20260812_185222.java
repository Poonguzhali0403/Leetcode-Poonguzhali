// Last updated: 8/12/2026, 6:52:22 PM
1class Solution {
2    public String restoreString(String s, int[] indices) {
3        char[] result = new char[s.length()];
4        
5        for (int i = 0; i < s.length(); i++) {
6            result[indices[i]] = s.charAt(i);
7        }
8        
9        return new String(result);
10    }
11}
12