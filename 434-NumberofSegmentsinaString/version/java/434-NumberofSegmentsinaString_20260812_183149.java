// Last updated: 8/12/2026, 6:31:49 PM
1class Solution {
2    public int countSegments(String s) {
3        int count = 0;
4        for (int i = 0; i < s.length(); i++) {
5            // A new segment starts when we see a non-space character
6            // and either it's the first character or the previous one was a space
7            if (s.charAt(i) != ' ' && (i == 0 || s.charAt(i - 1) == ' ')) {
8                count++;
9            }
10        }
11        return count;
12    }
13}
14