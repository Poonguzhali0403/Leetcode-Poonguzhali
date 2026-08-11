// Last updated: 8/11/2026, 2:16:41 PM
class Solution {
    
    public int rob(int[] nums) {
        int n = nums.length;

        if (n == 1) {
            return nums[0];
        }

        // Case 1: Exclude last house
        int option1 = robRange(nums, 0, n - 2);

        // Case 2: Exclude first house
        int option2 = robRange(nums, 1, n - 1);

        return Math.max(option1, option2);
    }

    private int robRange(int[] nums, int start, int end) {
        int prev1 = 0;
        int prev2 = 0;

        for (int i = start; i <= end; i++) {
            int curr = Math.max(prev1, prev2 + nums[i]);
            prev2 = prev1;
            prev1 = curr;
        }

        return prev1;
    }
}