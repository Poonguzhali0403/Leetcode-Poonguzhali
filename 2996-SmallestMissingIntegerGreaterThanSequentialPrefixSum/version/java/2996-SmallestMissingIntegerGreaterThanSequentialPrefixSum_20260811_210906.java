// Last updated: 8/11/2026, 9:09:06 PM
1import java.util.*;
2
3class Solution {
4    public int missingInteger(int[] nums) {
5        // Step 1: Find longest sequential prefix
6        int sum = nums[0];
7        for (int i = 1; i < nums.length; i++) {
8            if (nums[i] == nums[i - 1] + 1) {
9                sum += nums[i];
10            } else {
11                break;
12            }
13        }
14
15        // Step 2: Put all numbers into a set
16        Set<Integer> set = new HashSet<>();
17        for (int num : nums) {
18            set.add(num);
19        }
20
21        // Step 3: Find smallest missing integer >= sum
22        int candidate = sum;
23        while (set.contains(candidate)) {
24            candidate++;
25        }
26
27        return candidate;
28    }
29}
30