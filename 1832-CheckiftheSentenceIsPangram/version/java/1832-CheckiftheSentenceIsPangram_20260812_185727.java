// Last updated: 8/12/2026, 6:57:27 PM
1class Solution {
2    public boolean checkIfPangram(String sentence) {
3        boolean[] seen = new boolean[26];
4
5        for (char c : sentence.toCharArray()) {
6            seen[c - 'a'] = true;
7        }
8
9        for (boolean b : seen) {
10            if (!b) return false;
11        }
12
13        return true;
14    }
15}
16