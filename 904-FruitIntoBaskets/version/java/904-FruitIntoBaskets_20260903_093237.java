// Last updated: 9/3/2026, 9:32:37 AM
1import java.util.*;
2
3class Solution {
4    public int totalFruit(int[] fruits) {
5        Map<Integer, Integer> count = new HashMap<>();
6        int left = 0, maxLen = 0;
7
8        for (int right = 0; right < fruits.length; right++) {
9            count.put(fruits[right], count.getOrDefault(fruits[right], 0) + 1);
10
11            while (count.size() > 2) {
12                count.put(fruits[left], count.get(fruits[left]) - 1);
13                if (count.get(fruits[left]) == 0) {
14                    count.remove(fruits[left]);
15                }
16                left++;
17            }
18
19            maxLen = Math.max(maxLen, right - left + 1);
20        }
21
22        return maxLen;
23    }
24}
25