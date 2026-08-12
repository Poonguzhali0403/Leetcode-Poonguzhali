// Last updated: 8/12/2026, 7:05:45 PM
1class Solution {
2    public int countSubstrings(String s) {
3        int count = 0;
4
5        for (int i = 0; i < s.length(); i++) {
6            // Odd length palindromes
7            count += expandFromCenter(s, i, i);
8            // Even length palindromes
9            count += expandFromCenter(s, i, i + 1);
10        }
11
12        return count;
13    }
14
15    private int expandFromCenter(String s, int left, int right) {
16        int result = 0;
17        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
18            result++;
19            left--;
20            right++;
21        }
22        return result;
23    }
24}
25