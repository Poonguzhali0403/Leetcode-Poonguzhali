// Last updated: 8/12/2026, 6:14:01 PM
1import java.util.*;
2
3class Solution {
4    public boolean wordPattern(String pattern, String s) {
5        String[] words = s.split(" ");
6        if (pattern.length() != words.length) return false;
7
8        Map<Character, String> mapCharToWord = new HashMap<>();
9        Map<String, Character> mapWordToChar = new HashMap<>();
10
11        for (int i = 0; i < pattern.length(); i++) {
12            char c = pattern.charAt(i);
13            String w = words[i];
14
15            if (mapCharToWord.containsKey(c) && !mapCharToWord.get(c).equals(w)) return false;
16            if (mapWordToChar.containsKey(w) && mapWordToChar.get(w) != c) return false;
17
18            mapCharToWord.put(c, w);
19            mapWordToChar.put(w, c);
20        }
21
22        return true;
23    }
24}
25