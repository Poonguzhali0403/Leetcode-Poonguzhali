// Last updated: 9/3/2026, 8:59:03 AM
1class Solution {
2    public int countCompleteSubstrings(String word, int k) {
3        int n = word.length();
4        int result = 0;
5
6        // Split into adjacency-valid blocks
7        int start = 0;
8        for (int i = 1; i <= n; i++) {
9            if (i == n || Math.abs(word.charAt(i) - word.charAt(i - 1)) > 2) {
10                result += countBlock(word.substring(start, i), k);
11                start = i;
12            }
13        }
14        return result;
15    }
16
17    private int countBlock(String block, int k) {
18        int m = block.length();
19        int res = 0;
20
21        // Try all possible distinct character counts
22        for (int distinct = 1; distinct <= 26; distinct++) {
23            int windowSize = distinct * k;
24            if (windowSize > m) break;
25
26            int[] freq = new int[26];
27            int validChars = 0;
28
29            // Initialize first window
30            for (int i = 0; i < windowSize; i++) {
31                int idx = block.charAt(i) - 'a';
32                freq[idx]++;
33                if (freq[idx] == k) validChars++;
34                else if (freq[idx] == k + 1) validChars--;
35            }
36            if (validChars == distinct) res++;
37
38            // Slide window
39            for (int i = windowSize; i < m; i++) {
40                int add = block.charAt(i) - 'a';
41                int remove = block.charAt(i - windowSize) - 'a';
42
43                // Remove old char
44                if (freq[remove] == k) validChars--;
45                freq[remove]--;
46                if (freq[remove] == k) validChars++;
47
48                // Add new char
49                if (freq[add] == k) validChars--;
50                freq[add]++;
51                if (freq[add] == k) validChars++;
52
53                if (validChars == distinct) res++;
54            }
55        }
56        return res;
57    }
58}
59