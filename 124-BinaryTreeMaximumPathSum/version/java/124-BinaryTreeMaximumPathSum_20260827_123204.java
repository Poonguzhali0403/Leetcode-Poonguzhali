// Last updated: 8/27/2026, 12:32:04 PM
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    private int maxSum;
18
19    public int maxPathSum(TreeNode root) {
20        maxSum = Integer.MIN_VALUE;
21        dfs(root);
22        return maxSum;
23    }
24
25    private int dfs(TreeNode node) {
26        if (node == null) return 0;
27
28        int leftGain = Math.max(dfs(node.left), 0);
29        int rightGain = Math.max(dfs(node.right), 0);
30
31        // Path through current node
32        int currentPath = node.val + leftGain + rightGain;
33
34        // Update global maximum
35        maxSum = Math.max(maxSum, currentPath);
36
37        // Return max gain to parent
38        return node.val + Math.max(leftGain, rightGain);
39    }
40}
41