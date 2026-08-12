// Last updated: 8/12/2026, 6:40:51 PM
1class Solution {
2    public int[] shortestToChar(String s, char c) {
3        int n = s.length();
4        int[] result = new int[n];
5        int prev = Integer.MIN_VALUE / 2; // very small number
6
7        // Left to right pass
8        for (int i = 0; i < n; i++) {
9            if (s.charAt(i) == c) {
10                prev = i;
11            }
12            result[i] = i - prev;
13        }
14
15        // Right to left pass
16        prev = Integer.MAX_VALUE / 2; // very large number
17        for (int i = n - 1; i >= 0; i--) {
18            if (s.charAt(i) == c) {
19                prev = i;
20            }
21            result[i] = Math.min(result[i], prev - i);
22        }
23
24        return result;
25    }
26}
27