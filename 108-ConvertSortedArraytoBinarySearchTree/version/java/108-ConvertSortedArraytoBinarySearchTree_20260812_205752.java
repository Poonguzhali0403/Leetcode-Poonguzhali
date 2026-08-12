// Last updated: 8/12/2026, 8:57:52 PM
1class Solution {
2    public TreeNode sortedArrayToBST(int[] nums) {
3        return buildTree(nums, 0, nums.length - 1);
4    }
5
6    private TreeNode buildTree(int[] nums, int left, int right) {
7        if (left > right) return null;
8
9        int mid = left + (right - left) / 2; // middle index
10        TreeNode node = new TreeNode(nums[mid]);
11
12        node.left = buildTree(nums, left, mid - 1);
13        node.right = buildTree(nums, mid + 1, right);
14
15        return node;
16    }
17}
18