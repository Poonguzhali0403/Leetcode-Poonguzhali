// Last updated: 8/12/2026, 8:00:53 PM
1import java.util.*;
2
3class Solution {
4    public int countWords(String[] words1, String[] words2) {
5        // Step 1: Count frequencies
6        Map<String, Integer> freq1 = new HashMap<>();
7        Map<String, Integer> freq2 = new HashMap<>();
8        
9        for (String w : words1) {
10            freq1.put(w, freq1.getOrDefault(w, 0) + 1);
11        }
12        for (String w : words2) {
13            freq2.put(w, freq2.getOrDefault(w, 0) + 1);
14        }
15        
16        // Step 2: Count words that appear exactly once in both
17        int count = 0;
18        for (String word : freq1.keySet()) {
19            if (freq1.get(word) == 1 && freq2.getOrDefault(word, 0) == 1) {
20                count++;
21            }
22        }
23        
24        return count;
25    }
26}
27