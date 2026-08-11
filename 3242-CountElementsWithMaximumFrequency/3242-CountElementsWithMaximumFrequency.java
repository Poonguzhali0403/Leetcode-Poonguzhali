// Last updated: 8/11/2026, 2:13:55 PM
import java.util.*;

class Solution {
    public int maxFrequencyElements(int[] nums) {
        // Step 1: Count occurrences
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        // Step 2: Find maximum frequency
        int maxFreq = 0;
        for (int freq : countMap.values()) {
            maxFreq = Math.max(maxFreq, freq);
        }

        // Step 3: Sum frequencies of elements with max frequency
        int total = 0;
        for (int freq : countMap.values()) {
            if (freq == maxFreq) {
                total += freq;
            }
        }

        return total;
    }
}
