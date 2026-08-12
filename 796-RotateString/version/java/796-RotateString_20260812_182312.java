// Last updated: 8/12/2026, 6:23:12 PM
1class Solution {
2    public boolean rotateString(String s, String goal) {
3        if (s.length() != goal.length()) return false;
4        String doubled = s + s;
5        return doubled.contains(goal);
6    }
7}
8