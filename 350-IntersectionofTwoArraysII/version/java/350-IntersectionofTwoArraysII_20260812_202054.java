// Last updated: 8/12/2026, 8:20:54 PM
1import java.util.*;
2
3class Solution {
4    public int[] intersect(int[] nums1, int[] nums2) {
5        Map<Integer, Integer> countMap = new HashMap<>();
6        List<Integer> result = new ArrayList<>();
7        
8        // Count frequencies in nums1
9        for (int num : nums1) {
10            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
11        }
12        
13        // Check nums2 against nums1 counts
14        for (int num : nums2) {
15            if (countMap.getOrDefault(num, 0) > 0) {
16                result.add(num);
17                countMap.put(num, countMap.get(num) - 1);
18            }
19        }
20        
21        // Convert list to array
22        int[] output = new int[result.size()];
23        for (int i = 0; i < result.size(); i++) {
24            output[i] = result.get(i);
25        }
26        
27        return output;
28    }
29}
30