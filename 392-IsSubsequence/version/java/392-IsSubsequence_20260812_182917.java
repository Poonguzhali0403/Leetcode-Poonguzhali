// Last updated: 8/12/2026, 6:29:17 PM
1class Solution {
2    public boolean isSubsequence(String s, String t) {
3        int i = 0, j = 0;
4        while (i < s.length() && j < t.length()) {
5            if (s.charAt(i) == t.charAt(j)) {
6                i++;
7            }
8            j++;
9        }
10        return i == s.length();
11    }
12}
13