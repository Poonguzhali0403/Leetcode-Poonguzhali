// Last updated: 8/12/2026, 8:48:18 PM
1import java.util.*;
2
3class Solution {
4    public int calculate(String s) {
5        int result = 0;
6        int sign = 1; // current sign (+1 or -1)
7        int num = 0;
8        Stack<Integer> stack = new Stack<>();
9        
10        for (int i = 0; i < s.length(); i++) {
11            char c = s.charAt(i);
12            
13            if (Character.isDigit(c)) {
14                num = num * 10 + (c - '0'); // build number
15            } else if (c == '+') {
16                result += sign * num;
17                num = 0;
18                sign = 1;
19            } else if (c == '-') {
20                result += sign * num;
21                num = 0;
22                sign = -1;
23            } else if (c == '(') {
24                // push current result and sign
25                stack.push(result);
26                stack.push(sign);
27                result = 0;
28                sign = 1;
29            } else if (c == ')') {
30                result += sign * num;
31                num = 0;
32                result *= stack.pop(); // pop sign
33                result += stack.pop(); // pop previous result
34            }
35        }
36        
37        if (num != 0) {
38            result += sign * num;
39        }
40        
41        return result;
42    }
43}
44