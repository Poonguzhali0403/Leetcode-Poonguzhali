// Last updated: 8/11/2026, 9:23:21 PM
1class Solution {
2    public int[] decompressRLElist(int[] nums) {
3        // Step 1: Calculate total size of decompressed array
4        int size = 0;
5        for (int i = 0; i < nums.length; i += 2) {
6            size += nums[i]; // frequency
7        }
8
9        // Step 2: Fill result array
10        int[] result = new int[size];
11        int index = 0;
12
13        for (int i = 0; i < nums.length; i += 2) {
14            int freq = nums[i];
15            int val = nums[i + 1];
16            for (int j = 0; j < freq; j++) {
17                result[index++] = val;
18            }
19        }
20
21        return result;
22    }
23}
24