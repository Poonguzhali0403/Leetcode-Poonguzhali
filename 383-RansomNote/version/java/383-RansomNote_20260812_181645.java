// Last updated: 8/12/2026, 6:16:45 PM
1class Solution {
2    public boolean canConstruct(String ransomNote, String magazine) {
3        int[] count = new int[26];
4
5        for (char c : magazine.toCharArray()) {
6            count[c - 'a']++;
7        }
8
9        for (char c : ransomNote.toCharArray()) {
10            count[c - 'a']--;
11            if (count[c - 'a'] < 0) {
12                return false;
13            }
14        }
15
16        return true;
17    }
18}
19