// Last updated: 8/12/2026, 6:05:44 PM
1import java.util.*;
2
3class Solution {
4    public boolean isAnagram(String s, String t) {
5        if (s.length() != t.length()) return false;
6
7        int[] count = new int[26];
8        for (char c : s.toCharArray()) {
9            count[c - 'a']++;
10        }
11        for (char c : t.toCharArray()) {
12            count[c - 'a']--;
13        }
14        for (int val : count) {
15            if (val != 0) return false;
16        }
17        return true;
18    }
19}
20