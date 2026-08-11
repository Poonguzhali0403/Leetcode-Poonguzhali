// Last updated: 8/11/2026, 8:33:16 PM
1class Solution {
2    public int mctFromLeafValues(int[] arr) {
3        int res = 0;
4        Stack<Integer> stack = new Stack<>();
5        stack.push(Integer.MAX_VALUE); // sentinel
6
7        for (int num : arr) {
8            while (stack.peek() <= num) {
9                int mid = stack.pop();
10                res += mid * Math.min(stack.peek(), num);
11            }
12            stack.push(num);
13        }
14
15        // merge remaining stack elements
16        while (stack.size() > 2) {
17            res += stack.pop() * stack.peek();
18        }
19
20        return res;
21    }
22}
23