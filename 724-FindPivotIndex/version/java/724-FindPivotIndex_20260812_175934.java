// Last updated: 8/12/2026, 5:59:34 PM
1class Solution {
2    public int pivotIndex(int[] nums) {
3        int totalSum = 0;
4        for (int num : nums) {
5            totalSum += num;
6        }
7
8        int leftSum = 0;
9        for (int i = 0; i < nums.length; i++) {
10            if (leftSum == totalSum - leftSum - nums[i]) {
11                return i;
12            }
13            leftSum += nums[i];
14        }
15        return -1;
16    }
17}
18