// Last updated: 8/27/2026, 12:17:52 PM
1import java.util.*;
2
3class Solution {
4    public int[] asteroidCollision(int[] asteroids) {
5        Stack<Integer> stack = new Stack<>();
6
7        for (int a : asteroids) {
8            boolean alive = true;
9
10            while (alive && a < 0 && !stack.isEmpty() && stack.peek() > 0) {
11                int top = stack.peek();
12                if (top < -a) {
13                    stack.pop(); // top explodes, keep checking
14                } else if (top == -a) {
15                    stack.pop(); // both explode
16                    alive = false;
17                } else {
18                    alive = false; // incoming asteroid explodes
19                }
20            }
21
22            if (alive) {
23                stack.push(a);
24            }
25        }
26
27        // Convert stack to array
28        int[] result = new int[stack.size()];
29        for (int i = result.length - 1; i >= 0; i--) {
30            result[i] = stack.pop();
31        }
32        return result;
33    }
34}
35