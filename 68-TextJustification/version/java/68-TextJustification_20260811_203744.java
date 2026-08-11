// Last updated: 8/11/2026, 8:37:44 PM
1import java.util.*;
2
3class Solution {
4    public List<String> fullJustify(String[] words, int maxWidth) {
5        List<String> result = new ArrayList<>();
6        int i = 0;
7
8        while (i < words.length) {
9            int lineLen = words[i].length();
10            int j = i + 1;
11
12            // Greedily add words until maxWidth exceeded
13            while (j < words.length && lineLen + 1 + words[j].length() <= maxWidth) {
14                lineLen += 1 + words[j].length();
15                j++;
16            }
17
18            int gaps = j - i - 1;
19            StringBuilder sb = new StringBuilder();
20
21            // Case 1: Last line OR only one word
22            if (j == words.length || gaps == 0) {
23                for (int k = i; k < j; k++) {
24                    sb.append(words[k]);
25                    if (k < j - 1) sb.append(" ");
26                }
27                while (sb.length() < maxWidth) sb.append(" ");
28            } else {
29                // Case 2: Fully justify
30                int totalSpaces = maxWidth - (lineLen - gaps);
31                int spacePerGap = totalSpaces / gaps;
32                int extraSpaces = totalSpaces % gaps;
33
34                for (int k = i; k < j; k++) {
35                    sb.append(words[k]);
36                    if (k < j - 1) {
37                        for (int s = 0; s < spacePerGap; s++) sb.append(" ");
38                        if (extraSpaces > 0) {
39                            sb.append(" ");
40                            extraSpaces--;
41                        }
42                    }
43                }
44            }
45
46            result.add(sb.toString());
47            i = j;
48        }
49
50        return result;
51    }
52}
53