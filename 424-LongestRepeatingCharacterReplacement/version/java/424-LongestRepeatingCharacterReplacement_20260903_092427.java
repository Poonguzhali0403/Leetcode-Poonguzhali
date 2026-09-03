// Last updated: 9/3/2026, 9:24:27 AM
1class Solution {
2    public int characterReplacement(String s, int k) {
3        int[] count = new int[26];
4        int left = 0, maxCount = 0, result = 0;
5
6        for (int right = 0; right < s.length(); right++) {
7            int idx = s.charAt(right) - 'A';
8            count[idx]++;
9            maxCount = Math.max(maxCount, count[idx]);
10
11            // If more than k replacements needed, shrink window
12            while ((right - left + 1) - maxCount > k) {
13                count[s.charAt(left) - 'A']--;
14                left++;
15            }
16
17            result = Math.max(result, right - left + 1);
18        }
19
20        return result;
21    }
22}
23