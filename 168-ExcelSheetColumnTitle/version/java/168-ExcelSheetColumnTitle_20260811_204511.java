// Last updated: 8/11/2026, 8:45:11 PM
1class Solution {
2    public String convertToTitle(int columnNumber) {
3        StringBuilder sb = new StringBuilder();
4        
5        while (columnNumber > 0) {
6            columnNumber--; // adjust for 1-indexing
7            int remainder = columnNumber % 26;
8            sb.append((char) ('A' + remainder));
9            columnNumber /= 26;
10        }
11        
12        return sb.reverse().toString();
13    }
14}
15