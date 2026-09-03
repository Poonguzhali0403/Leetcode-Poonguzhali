// Last updated: 9/3/2026, 9:26:55 AM
1import java.util.*;
2
3class Solution {
4    public List<Integer> findAnagrams(String s, String p) {
5        List<Integer> result = new ArrayList<>();
6        if (s.length() < p.length()) return result;
7
8        int[] need = new int[26];
9        int[] window = new int[26];
10
11        for (char c : p.toCharArray()) {
12            need[c - 'a']++;
13        }
14
15        int left = 0, right = 0;
16        while (right < s.length()) {
17            window[s.charAt(right) - 'a']++;
18            right++;
19
20            if (right - left == p.length()) {
21                if (Arrays.equals(window, need)) {
22                    result.add(left);
23                }
24                window[s.charAt(left) - 'a']--;
25                left++;
26            }
27        }
28
29        return result;
30    }
31}
32