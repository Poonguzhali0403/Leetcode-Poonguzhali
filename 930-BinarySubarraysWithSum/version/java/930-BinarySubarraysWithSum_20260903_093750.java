// Last updated: 9/3/2026, 9:37:50 AM
1import java.util.*;
2
3class Solution {
4    public int numSubarraysWithSum(int[] nums, int goal) {
5        Map<Integer, Integer> prefixCount = new HashMap<>();
6        prefixCount.put(0, 1); // base case
7
8        int sum = 0, result = 0;
9        for (int num : nums) {
10            sum += num;
11
12            // Check if there exists a prefix sum that makes current sum - goal
13            if (prefixCount.containsKey(sum - goal)) {
14                result += prefixCount.get(sum - goal);
15            }
16
17            prefixCount.put(sum, prefixCount.getOrDefault(sum, 0) + 1);
18        }
19
20        return result;
21    }
22}
23