// Last updated: 8/12/2026, 6:20:33 PM
1import java.util.*;
2
3class Solution {
4    public long largestPerimeter(int[] nums) {
5        Arrays.sort(nums);
6        long total = 0;
7        for (int x : nums) total += x;
8
9        for (int i = nums.length - 1; i >= 2; i--) {
10            long sumOthers = total - nums[i];
11            if (sumOthers > nums[i]) {
12                return total; // valid polygon perimeter
13            }
14            total -= nums[i]; // remove the largest side and try again
15        }
16        return -1;
17    }
18}
19