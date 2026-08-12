// Last updated: 8/12/2026, 5:55:04 PM
1class Solution {
2    public boolean isPalindrome(String s) {
3        int left = 0;
4        int right = s.length() - 1;
5
6        while (left < right) {
7            // Skip non-alphanumeric characters
8            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
9                left++;
10            }
11            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
12                right--;
13            }
14
15            // Compare characters (case-insensitive)
16            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
17                return false;
18            }
19
20            left++;
21            right--;
22        }
23        return true;
24    }
25}
26