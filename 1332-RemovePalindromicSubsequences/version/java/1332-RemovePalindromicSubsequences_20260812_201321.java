// Last updated: 8/12/2026, 8:13:21 PM
1class Solution {
2    public int removePalindromeSub(String s) {
3        // If the string is already a palindrome, remove it in one step
4        if (isPalindrome(s)) {
5            return 1;
6        }
7        // Otherwise, remove all 'a's and then all 'b's
8        return 2;
9    }
10    
11    private boolean isPalindrome(String s) {
12        int left = 0, right = s.length() - 1;
13        while (left < right) {
14            if (s.charAt(left) != s.charAt(right)) {
15                return false;
16            }
17            left++;
18            right--;
19        }
20        return true;
21    }
22}
23