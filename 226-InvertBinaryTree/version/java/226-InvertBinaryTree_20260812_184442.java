// Last updated: 8/12/2026, 6:44:42 PM
1class Solution {
2    public TreeNode invertTree(TreeNode root) {
3        if (root == null) return null;
4
5        TreeNode temp = root.left;
6        root.left = invertTree(root.right);
7        root.right = invertTree(temp);
8
9        return root;
10    }
11}
12