// Last updated: 8/12/2026, 9:06:48 PM
1class NumArray {
2    private int[] prefix;
3
4    public NumArray(int[] nums) {
5        prefix = new int[nums.length + 1];
6        prefix[0] = 0;
7        for (int i = 0; i < nums.length; i++) {
8            prefix[i + 1] = prefix[i] + nums[i];
9        }
10    }
11
12    public int sumRange(int left, int right) {
13        return prefix[right + 1] - prefix[left];
14    }
15}
16