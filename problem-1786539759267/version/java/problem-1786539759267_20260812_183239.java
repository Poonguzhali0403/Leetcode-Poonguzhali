// Last updated: 8/12/2026, 6:32:39 PM
1class Solution {
2    public boolean repeatedSubstringPattern(String s) {
3        String doubled = s + s;
4        // Remove the first and last character to avoid trivial match
5        return doubled.substring(1, doubled.length() - 1).contains(s);
6    }
7}
8