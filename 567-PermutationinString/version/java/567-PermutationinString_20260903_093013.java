// Last updated: 9/3/2026, 9:30:13 AM
1import java.util.*;
2
3class Solution {
4    public boolean checkInclusion(String s1, String s2) {
5        if (s1.length() > s2.length()) return false;
6
7        int[] need = new int[26];
8        int[] window = new int[26];
9
10        for (char c : s1.toCharArray()) {
11            need[c - 'a']++;
12        }
13
14        int left = 0, right = 0;
15        while (right < s2.length()) {
16            window[s2.charAt(right) - 'a']++;
17            right++;
18
19            if (right - left > s1.length()) {
20                window[s2.charAt(left) - 'a']--;
21                left++;
22            }
23
24            if (Arrays.equals(window, need)) {
25                return true;
26            }
27        }
28
29        return false;
30    }
31}
32