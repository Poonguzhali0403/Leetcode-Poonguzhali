// Last updated: 8/12/2026, 6:57:07 PM
1class Solution {
2    public String convert(String s, int numRows) {
3        if (numRows == 1 || s.length() <= numRows) return s;
4
5        StringBuilder[] rows = new StringBuilder[numRows];
6        for (int i = 0; i < numRows; i++) {
7            rows[i] = new StringBuilder();
8        }
9
10        int curRow = 0;
11        boolean goingDown = false;
12
13        for (char c : s.toCharArray()) {
14            rows[curRow].append(c);
15
16            if (curRow == 0 || curRow == numRows - 1) {
17                goingDown = !goingDown;
18            }
19
20            curRow += goingDown ? 1 : -1;
21        }
22
23        StringBuilder result = new StringBuilder();
24        for (StringBuilder row : rows) {
25            result.append(row);
26        }
27
28        return result.toString();
29    }
30}
31