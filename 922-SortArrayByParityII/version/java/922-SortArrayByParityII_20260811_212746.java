// Last updated: 8/11/2026, 9:27:46 PM
1class Solution {
2    public int[] sortArrayByParityII(int[] nums) {
3        int n = nums.length;
4        int i = 0; // even index
5        int j = 1; // odd index
6
7        while (i < n && j < n) {
8            // If even index has odd number
9            if (nums[i] % 2 == 1) {
10                // Find an odd index with even number
11                while (j < n && nums[j] % 2 == 1) {
12                    j += 2;
13                }
14                // Swap
15                int temp = nums[i];
16                nums[i] = nums[j];
17                nums[j] = temp;
18            }
19            i += 2;
20        }
21
22        return nums;
23    }
24}
25