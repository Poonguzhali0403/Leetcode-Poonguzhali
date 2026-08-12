// Last updated: 8/12/2026, 8:37:06 PM
1import java.util.*;
2
3class Solution {
4    public int calPoints(String[] ops) {
5        Stack<Integer> stack = new Stack<>();
6        
7        for (String op : ops) {
8            if (op.equals("C")) {
9                stack.pop(); // remove last score
10            } else if (op.equals("D")) {
11                stack.push(stack.peek() * 2); // double last score
12            } else if (op.equals("+")) {
13                int last = stack.pop();
14                int secondLast = stack.peek();
15                stack.push(last); // put back last
16                stack.push(last + secondLast); // sum of last two
17            } else {
18                stack.push(Integer.parseInt(op)); // add new score
19            }
20        }
21        
22        int sum = 0;
23        for (int score : stack) {
24            sum += score;
25        }
26        return sum;
27    }
28}
29