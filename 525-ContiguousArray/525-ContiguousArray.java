// Last updated: 8/11/2026, 2:15:32 PM
import java.util.*;

class Solution {
    public int findMaxLength(int[] nums) {
        Map<Integer, Integer> sumIndexMap = new HashMap<>();
        sumIndexMap.put(0, -1); // Base case: sum 0 at index -1

        int maxLen = 0;
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            // Treat 0 as -1
            sum += (nums[i] == 0 ? -1 : 1);

            if (sumIndexMap.containsKey(sum)) {
                // Subarray between previous index and current index has equal 0s and 1s
                maxLen = Math.max(maxLen, i - sumIndexMap.get(sum));
            } else {
                // Store first occurrence of this sum
                sumIndexMap.put(sum, i);
            }
        }

        return maxLen;
    }
}
