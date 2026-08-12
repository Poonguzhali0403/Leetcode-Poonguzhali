// Last updated: 8/12/2026, 6:19:20 PM
1class Solution {
2    public String toLowerCase(String s) {
3        StringBuilder sb = new StringBuilder();
4        for (char c : s.toCharArray()) {
5            if (c >= 'A' && c <= 'Z') {
6                sb.append((char)(c + 32)); // convert uppercase to lowercase
7            } else {
8                sb.append(c);
9            }
10        }
11        return sb.toString();
12    }
13}
14