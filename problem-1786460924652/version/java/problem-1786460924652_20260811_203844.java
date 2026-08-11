// Last updated: 8/11/2026, 8:38:44 PM
1class Solution {
2    public int firstMissingPositive(int[] nums) {
3        int n = nums.length;
4
5        // Step 1: Place each number in its correct index
6        for (int i = 0; i < n; i++) {
7            while (nums[i] > 0 && nums[i] <= n && nums[nums[i] - 1] != nums[i]) {
8                int temp = nums[i];
9                nums[i] = nums[temp - 1];
10                nums[temp - 1] = temp;
11            }
12        }
13
14        // Step 2: Find the first index where nums[i] != i+1
15        for (int i = 0; i < n; i++) {
16            if (nums[i] != i + 1) {
17                return i + 1;
18            }
19        }
20
21        // Step 3: If all positions are correct, answer is n+1
22        return n + 1;
23    }
24}
25