// Last updated: 8/27/2026, 12:22:26 PM
1import java.util.*;
2
3class Solution {
4    public int[] nextGreaterElements(int[] nums) {
5        int n = nums.length;
6        int[] result = new int[n];
7        Arrays.fill(result, -1); // default to -1
8        Stack<Integer> stack = new Stack<>(); // store indices
9
10        // Traverse twice to simulate circular array
11        for (int i = 0; i < 2 * n; i++) {
12            int num = nums[i % n];
13            while (!stack.isEmpty() && nums[stack.peek()] < num) {
14                result[stack.pop()] = num;
15            }
16            if (i < n) {
17                stack.push(i); // only push indices in first pass
18            }
19        }
20
21        return result;
22    }
23}
24