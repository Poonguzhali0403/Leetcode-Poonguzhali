// Last updated: 8/12/2026, 6:30:01 PM
1import java.util.Stack;
2
3class MinStack {
4    private Stack<Integer> stack;
5    private Stack<Integer> minStack;
6
7    public MinStack() {
8        stack = new Stack<>();
9        minStack = new Stack<>();
10    }
11
12    public void push(int val) {
13        stack.push(val);
14        if (minStack.isEmpty() || val <= minStack.peek()) {
15            minStack.push(val);
16        }
17    }
18
19    public void pop() {
20        int removed = stack.pop();
21        if (removed == minStack.peek()) {
22            minStack.pop();
23        }
24    }
25
26    public int top() {
27        return stack.peek();
28    }
29
30    public int getMin() {
31        return minStack.peek();
32    }
33}
34