// Last updated: 8/12/2026, 6:00:59 PM
1import java.util.*;
2
3class Solution {
4    public List<Integer> findDisappearedNumbers(int[] nums) {
5        for (int i = 0; i < nums.length; i++) {
6            int index = Math.abs(nums[i]) - 1;
7            if (nums[index] > 0) {
8                nums[index] = -nums[index];
9            }
10        }
11
12        List<Integer> result = new ArrayList<>();
13        for (int i = 0; i < nums.length; i++) {
14            if (nums[i] > 0) {
15                result.add(i + 1);
16            }
17        }
18        return result;
19    }
20}
21