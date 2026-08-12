// Last updated: 8/12/2026, 8:07:31 PM
1import java.util.*;
2
3class Solution {
4    public int maximumNumberOfStringPairs(String[] words) {
5        Set<String> seen = new HashSet<>();
6        int count = 0;
7        
8        for (String word : words) {
9            String rev = new StringBuilder(word).reverse().toString();
10            if (seen.contains(rev)) {
11                count++;
12                seen.remove(rev); // ensure each word is used only once
13            } else {
14                seen.add(word);
15            }
16        }
17        
18        return count;
19    }
20}
21