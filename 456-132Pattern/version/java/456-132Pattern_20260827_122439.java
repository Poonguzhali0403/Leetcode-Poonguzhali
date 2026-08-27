// Last updated: 8/27/2026, 12:24:39 PM
1import java.util.*;
2
3class Solution {
4    public boolean find132pattern(int[] nums) {
5        int n = nums.length;
6        if (n < 3) return false;
7
8        Stack<Integer> stack = new Stack<>();
9        int third = Integer.MIN_VALUE; // candidate for nums[k]
10
11        // Traverse from right to left
12        for (int i = n - 1; i >= 0; i--) {
13            if (nums[i] < third) {
14                return true; // found nums[i] < nums[k] < nums[j]
15            }
16            while (!stack.isEmpty() && nums[i] > stack.peek()) {
17                third = stack.pop(); // update nums[k]
18            }
19            stack.push(nums[i]);
20        }
21
22        return false;
23    }
24}
25