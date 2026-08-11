// Last updated: 8/11/2026, 9:25:49 PM
1class Solution {
2    public int[] sortArrayByParity(int[] nums) {
3        int left = 0, right = nums.length - 1;
4
5        while (left < right) {
6            // If left is odd and right is even, swap
7            if (nums[left] % 2 > nums[right] % 2) {
8                int temp = nums[left];
9                nums[left] = nums[right];
10                nums[right] = temp;
11            }
12
13            // Move left pointer if even
14            if (nums[left] % 2 == 0) left++;
15            // Move right pointer if odd
16            if (nums[right] % 2 == 1) right--;
17        }
18
19        return nums;
20    }
21}
22