// Last updated: 8/11/2026, 2:14:59 PM
import java.util.*;

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        // Step 1: Count occurrences
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        // Step 2: Check uniqueness of frequencies
        Set<Integer> freqSet = new HashSet<>();
        for (int freq : countMap.values()) {
            if (!freqSet.add(freq)) {
                return false; // Duplicate frequency found
            }
        }
        return true; // All frequencies are unique
    }
}
