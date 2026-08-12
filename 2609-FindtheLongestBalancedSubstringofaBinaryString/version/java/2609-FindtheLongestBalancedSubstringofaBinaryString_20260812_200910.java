// Last updated: 8/12/2026, 8:09:10 PM
1class Solution {
2    public int findTheLongestBalancedSubstring(String s) {
3        int maxLen = 0;
4        int zeros = 0, ones = 0;
5
6        for (int i = 0; i < s.length(); i++) {
7            if (s.charAt(i) == '0') {
8                // reset counts if a new sequence starts after ones
9                if (i > 0 && s.charAt(i - 1) == '1') {
10                    zeros = 0;
11                    ones = 0;
12                }
13                zeros++;
14            } else {
15                ones++;
16                maxLen = Math.max(maxLen, 2 * Math.min(zeros, ones));
17            }
18        }
19
20        return maxLen;
21    }
22}
23