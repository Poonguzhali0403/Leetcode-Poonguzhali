// Last updated: 8/12/2026, 6:13:16 PM
1import java.util.*;
2
3class Solution {
4    public boolean isIsomorphic(String s, String t) {
5        if (s.length() != t.length()) return false;
6
7        Map<Character, Character> mapST = new HashMap<>();
8        Map<Character, Character> mapTS = new HashMap<>();
9
10        for (int i = 0; i < s.length(); i++) {
11            char c1 = s.charAt(i);
12            char c2 = t.charAt(i);
13
14            if (mapST.containsKey(c1) && mapST.get(c1) != c2) return false;
15            if (mapTS.containsKey(c2) && mapTS.get(c2) != c1) return false;
16
17            mapST.put(c1, c2);
18            mapTS.put(c2, c1);
19        }
20
21        return true;
22    }
23}
24