// Last updated: 8/12/2026, 6:49:37 PM
1class Solution {
2    public int maxPower(String s) {
3        int maxLen = 1;
4        int count = 1;
5
6        for (int i = 1; i < s.length(); i++) {
7            if (s.charAt(i) == s.charAt(i - 1)) {
8                count++;
9                maxLen = Math.max(maxLen, count);
10            } else {
11                count = 1;
12            }
13        }
14
15        return maxLen;
16    }
17}
18