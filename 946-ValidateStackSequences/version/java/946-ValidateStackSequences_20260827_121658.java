// Last updated: 8/27/2026, 12:16:58 PM
1import java.util.*;
2
3class Solution {
4    public boolean validateStackSequences(int[] pushed, int[] popped) {
5        Stack<Integer> stack = new Stack<>();
6        int j = 0; // pointer for popped array
7
8        for (int x : pushed) {
9            stack.push(x);
10            // keep popping while top matches popped[j]
11            while (!stack.isEmpty() && j < popped.length && stack.peek() == popped[j]) {
12                stack.pop();
13                j++;
14            }
15        }
16
17        return stack.isEmpty();
18    }
19}
20