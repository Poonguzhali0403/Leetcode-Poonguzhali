// Last updated: 8/12/2026, 6:11:18 PM
1class Solution {
2    public boolean validPalindrome(String s) {
3        int left = 0, right = s.length() - 1;
4        while (left < right) {
5            if (s.charAt(left) != s.charAt(right)) {
6                return isPalindrome(s, left + 1, right) || isPalindrome(s, left, right - 1);
7            }
8            left++;
9            right--;
10        }
11        return true;
12    }
13
14    private boolean isPalindrome(String s, int left, int right) {
15        while (left < right) {
16            if (s.charAt(left) != s.charAt(right)) return false;
17            left++;
18            right--;
19        }
20        return true;
21    }
22}
23