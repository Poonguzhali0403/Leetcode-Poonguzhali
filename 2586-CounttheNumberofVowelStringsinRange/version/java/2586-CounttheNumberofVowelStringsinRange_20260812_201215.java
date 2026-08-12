// Last updated: 8/12/2026, 8:12:15 PM
1class Solution {
2    public int vowelStrings(String[] words, int left, int right) {
3        int count = 0;
4        String vowels = "aeiou";
5        
6        for (int i = left; i <= right; i++) {
7            String word = words[i];
8            if (vowels.indexOf(word.charAt(0)) != -1 &&
9                vowels.indexOf(word.charAt(word.length() - 1)) != -1) {
10                count++;
11            }
12        }
13        
14        return count;
15    }
16}
17