// Last updated: 9/3/2026, 9:15:39 AM
1class Solution {
2    public int[] twoSum(int[] numbers, int target) {
3        int left = 0, right = numbers.length - 1;
4
5        while (left < right) {
6            int sum = numbers[left] + numbers[right];
7
8            if (sum == target) {
9                return new int[]{left + 1, right + 1}; // 1-indexed
10            } else if (sum < target) {
11                left++;
12            } else {
13                right--;
14            }
15        }
16
17        return new int[]{-1, -1}; // should never happen
18    }
19}
20