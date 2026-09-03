// Last updated: 9/3/2026, 9:19:47 AM
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
17    private int cameras = 0;
18
19    public int minCameraCover(TreeNode root) {
20        if (dfs(root) == 0) {
21            cameras++;
22        }
23        return cameras;
24    }
25
26    // Returns state: 0 = not covered, 1 = has camera, 2 = covered
27    private int dfs(TreeNode node) {
28        if (node == null) return 2; // null nodes are considered covered
29
30        int left = dfs(node.left);
31        int right = dfs(node.right);
32
33        if (left == 0 || right == 0) {
34            cameras++;
35            return 1; // place camera here
36        }
37        if (left == 1 || right == 1) {
38            return 2; // covered by child’s camera
39        }
40        return 0; // not covered
41    }
42}
43