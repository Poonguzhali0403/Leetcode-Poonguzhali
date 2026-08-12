// Last updated: 8/12/2026, 6:35:44 PM
1class Solution {
2    public String reverseWords(String s) {
3        String[] words = s.split(" ");
4        StringBuilder result = new StringBuilder();
5        
6        for (int i = 0; i < words.length; i++) {
7            result.append(new StringBuilder(words[i]).reverse());
8            if (i < words.length - 1) {
9                result.append(" ");
10            }
11        }
12        
13        return result.toString();
14    }
15}
16