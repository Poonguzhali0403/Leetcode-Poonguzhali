// Last updated: 9/3/2026, 9:35:03 AM
1class Solution {
2    public int longestOnes(int[] nums, int k) {
3        int left = 0, right = 0;
4        int maxLen = 0;
5
6        while (right < nums.length) {
7            if (nums[right] == 0) {
8                k--;
9            }
10            right++;
11
12            while (k < 0) {
13                if (nums[left] == 0) {
14                    k++;
15                }
16                left++;
17            }
18
19            maxLen = Math.max(maxLen, right - left);
20        }
21
22        return maxLen;
23    }
24}
25