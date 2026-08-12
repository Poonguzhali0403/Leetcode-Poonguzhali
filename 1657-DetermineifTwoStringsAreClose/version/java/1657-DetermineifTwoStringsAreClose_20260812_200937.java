// Last updated: 8/12/2026, 8:09:37 PM
1import java.util.*;
2
3class Solution {
4    public boolean closeStrings(String word1, String word2) {
5        if (word1.length() != word2.length()) return false;
6
7        int[] freq1 = new int[26];
8        int[] freq2 = new int[26];
9
10        for (char c : word1.toCharArray()) {
11            freq1[c - 'a']++;
12        }
13        for (char c : word2.toCharArray()) {
14            freq2[c - 'a']++;
15        }
16
17        // Check if both words use the same set of characters
18        for (int i = 0; i < 26; i++) {
19            if ((freq1[i] == 0 && freq2[i] != 0) || (freq1[i] != 0 && freq2[i] == 0)) {
20                return false;
21            }
22        }
23
24        // Compare frequency distributions (order doesn’t matter)
25        Arrays.sort(freq1);
26        Arrays.sort(freq2);
27
28        return Arrays.equals(freq1, freq2);
29    }
30}
31