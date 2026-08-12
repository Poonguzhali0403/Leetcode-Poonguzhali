// Last updated: 8/12/2026, 8:33:36 PM
1import java.util.*;
2
3class Solution {
4    public int[] intersection(int[] nums1, int[] nums2) {
5        Set<Integer> set1 = new HashSet<>();
6        Set<Integer> resultSet = new HashSet<>();
7        
8        // Add all elements of nums1 to set1
9        for (int num : nums1) {
10            set1.add(num);
11        }
12        
13        // Check nums2 against set1
14        for (int num : nums2) {
15            if (set1.contains(num)) {
16                resultSet.add(num);
17            }
18        }
19        
20        // Convert resultSet to array
21        int[] result = new int[resultSet.size()];
22        int i = 0;
23        for (int num : resultSet) {
24            result[i++] = num;
25        }
26        
27        return result;
28    }
29}
30