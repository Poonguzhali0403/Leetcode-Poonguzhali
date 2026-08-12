// Last updated: 8/12/2026, 9:03:09 PM
1import java.util.Arrays;
2
3class Solution {
4    public int findContentChildren(int[] g, int[] s) {
5        Arrays.sort(g); // sort greed factors
6        Arrays.sort(s); // sort cookie sizes
7
8        int child = 0, cookie = 0;
9
10        while (child < g.length && cookie < s.length) {
11            if (s[cookie] >= g[child]) {
12                // cookie satisfies this child
13                child++;
14            }
15            // move to next cookie
16            cookie++;
17        }
18
19        return child; // number of content children
20    }
21}
22