// Last updated: 8/12/2026, 8:06:34 PM
1import java.util.*;
2
3class Solution {
4    public List<Integer> findWordsContaining(String[] words, char x) {
5        List<Integer> result = new ArrayList<>();
6        
7        for (int i = 0; i < words.length; i++) {
8            if (words[i].indexOf(x) != -1) {
9                result.add(i);
10            }
11        }
12        
13        return result;
14    }
15}
16