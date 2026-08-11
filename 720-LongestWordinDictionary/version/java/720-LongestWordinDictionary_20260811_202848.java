// Last updated: 8/11/2026, 8:28:48 PM
1import java.util.*;
2
3class Solution {
4    public String longestWord(String[] words) {
5        Arrays.sort(words); // sort lexicographically first
6        Set<String> built = new HashSet<>();
7        String result = "";
8
9        for (String word : words) {
10            if (word.length() == 1 || built.contains(word.substring(0, word.length() - 1))) {
11                built.add(word);
12                if (word.length() > result.length() || 
13                   (word.length() == result.length() && word.compareTo(result) < 0)) {
14                    result = word;
15                }
16            }
17        }
18        return result;
19    }
20}
21