// Last updated: 8/11/2026, 2:16:35 PM
import java.util.HashSet;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        
        for (int n : nums) {
            if (seen.contains(n)) {
                return true;   // Duplicate found
            }
            seen.add(n);
        }
        
        return false;  // No duplicates
    }
}
