// Last updated: 8/12/2026, 5:54:03 PM
1import java.util.Stack;
2
3class Solution {
4    public boolean isValid(String s) {
5        Stack<Character> stack = new Stack<>();
6
7        for (char c : s.toCharArray()) {
8            if (c == '(' || c == '{' || c == '[') {
9                stack.push(c);
10            } else {
11                if (stack.isEmpty()) return false;
12
13                char top = stack.pop();
14                if ((c == ')' && top != '(') ||
15                    (c == '}' && top != '{') ||
16                    (c == ']' && top != '[')) {
17                    return false;
18                }
19            }
20        }
21        return stack.isEmpty();
22    }
23}
24