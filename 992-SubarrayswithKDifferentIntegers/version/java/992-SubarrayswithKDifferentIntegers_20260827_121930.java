// Last updated: 8/27/2026, 12:19:30 PM
1import java.util.*;
2
3class Solution {
4    public int subarraysWithKDistinct(int[] nums, int k) {
5        return atMostK(nums, k) - atMostK(nums, k - 1);
6    }
7
8    private int atMostK(int[] nums, int k) {
9        Map<Integer, Integer> freq = new HashMap<>();
10        int left = 0, result = 0;
11
12        for (int right = 0; right < nums.length; right++) {
13            freq.put(nums[right], freq.getOrDefault(nums[right], 0) + 1);
14
15            while (freq.size() > k) {
16                freq.put(nums[left], freq.get(nums[left]) - 1);
17                if (freq.get(nums[left]) == 0) {
18                    freq.remove(nums[left]);
19                }
20                left++;
21            }
22
23            result += right - left + 1;
24        }
25
26        return result;
27    }
28}
29