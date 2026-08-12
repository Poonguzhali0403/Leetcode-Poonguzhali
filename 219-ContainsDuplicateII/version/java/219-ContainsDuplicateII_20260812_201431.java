// Last updated: 8/12/2026, 8:14:31 PM
1import java.util.*;
2
3class Solution {
4    public boolean containsNearbyDuplicate(int[] nums, int k) {
5        Map<Integer, Integer> seen = new HashMap<>();
6        
7        for (int i = 0; i < nums.length; i++) {
8            if (seen.containsKey(nums[i])) {
9                if (i - seen.get(nums[i]) <= k) {
10                    return true;
11                }
12            }
13            seen.put(nums[i], i); // update latest index
14        }
15        
16        return false;
17    }
18}
19