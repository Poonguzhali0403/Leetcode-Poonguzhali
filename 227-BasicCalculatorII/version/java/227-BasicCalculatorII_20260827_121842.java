// Last updated: 8/27/2026, 12:18:42 PM
1class Solution {
2    public int calculate(String s) {
3        if (s == null || s.length() == 0) return 0;
4
5        int result = 0;
6        int lastNum = 0;
7        int num = 0;
8        char op = '+'; // previous operator
9
10        for (int i = 0; i < s.length(); i++) {
11            char c = s.charAt(i);
12
13            if (Character.isDigit(c)) {
14                num = num * 10 + (c - '0');
15            }
16
17            if ((!Character.isDigit(c) && c != ' ') || i == s.length() - 1) {
18                if (op == '+') {
19                    result += lastNum;
20                    lastNum = num;
21                } else if (op == '-') {
22                    result += lastNum;
23                    lastNum = -num;
24                } else if (op == '*') {
25                    lastNum = lastNum * num;
26                } else if (op == '/') {
27                    lastNum = lastNum / num;
28                }
29                op = c;
30                num = 0;
31            }
32        }
33
34        result += lastNum;
35        return result;
36    }
37}
38