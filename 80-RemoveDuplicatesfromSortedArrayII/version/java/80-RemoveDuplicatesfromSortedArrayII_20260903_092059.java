// Last updated: 9/3/2026, 9:20:59 AM
1class Solution {
2    public int removeDuplicates(int[] nums) {
3        if (nums.length <= 2) return nums.length;
4
5        int i = 2; // position to place next valid element
6        for (int j = 2; j < nums.length; j++) {
7            if (nums[j] != nums[i - 2]) {
8                nums[i] = nums[j];
9                i++;
10            }
11        }
12        return i; // length of array with at most two duplicates
13    }
14}
15