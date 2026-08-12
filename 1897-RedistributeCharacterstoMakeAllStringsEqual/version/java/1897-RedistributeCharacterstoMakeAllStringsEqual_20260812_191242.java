// Last updated: 8/12/2026, 7:12:42 PM
1class Solution {
2    public boolean makeEqual(String[] words) {
3        int[] freq = new int[26];
4        int n = words.length;
5
6        // Count frequency of each character across all words
7        for (String word : words) {
8            for (char c : word.toCharArray()) {
9                freq[c - 'a']++;
10            }
11        }
12
13        // Check divisibility by number of words
14        for (int count : freq) {
15            if (count % n != 0) {
16                return false;
17            }
18        }
19
20        return true;
21    }
22}
23