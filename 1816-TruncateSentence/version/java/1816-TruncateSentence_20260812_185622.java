// Last updated: 8/12/2026, 6:56:22 PM
1class Solution {
2    public String truncateSentence(String s, int k) {
3        String[] words = s.split(" ");
4        StringBuilder result = new StringBuilder();
5
6        for (int i = 0; i < k; i++) {
7            result.append(words[i]);
8            if (i < k - 1) {
9                result.append(" ");
10            }
11        }
12
13        return result.toString();
14    }
15}
16