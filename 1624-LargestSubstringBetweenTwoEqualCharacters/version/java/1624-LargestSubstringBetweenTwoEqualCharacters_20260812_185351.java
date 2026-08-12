// Last updated: 8/12/2026, 6:53:51 PM
1class Solution {
2    public int maxLengthBetweenEqualCharacters(String s) {
3        int[] firstIndex = new int[26];
4        Arrays.fill(firstIndex, -1);
5        int maxLen = -1;
6
7        for (int i = 0; i < s.length(); i++) {
8            int ch = s.charAt(i) - 'a';
9            if (firstIndex[ch] == -1) {
10                firstIndex[ch] = i; // store first occurrence
11            } else {
12                maxLen = Math.max(maxLen, i - firstIndex[ch] - 1);
13            }
14        }
15
16        return maxLen;
17    }
18}
19