// Last updated: 9/3/2026, 9:33:42 AM
1import java.util.*;
2
3/**
4 * Definition for a binary tree node.
5 * public class TreeNode {
6 *     int val;
7 *     TreeNode left;
8 *     TreeNode right;
9 *     TreeNode() {}
10 *     TreeNode(int val) { this.val = val; }
11 *     TreeNode(int val, TreeNode left, TreeNode right) {
12 *         this.val = val;
13 *         this.left = left;
14 *         this.right = right;
15 *     }
16 * }
17 */
18class Solution {
19    public List<List<Integer>> verticalTraversal(TreeNode root) {
20        List<int[]> nodes = new ArrayList<>(); 
21        dfs(root, 0, 0, nodes);
22
23        // Sort by col, then row, then value
24        Collections.sort(nodes, (a, b) -> {
25            if (a[0] != b[0]) return a[0] - b[0]; // col
26            if (a[1] != b[1]) return a[1] - b[1]; // row
27            return a[2] - b[2]; // value
28        });
29
30        List<List<Integer>> result = new ArrayList<>();
31        int prevCol = Integer.MIN_VALUE;
32        for (int[] node : nodes) {
33            int col = node[0], val = node[2];
34            if (col != prevCol) {
35                result.add(new ArrayList<>());
36                prevCol = col;
37            }
38            result.get(result.size() - 1).add(val);
39        }
40        return result;
41    }
42
43    private void dfs(TreeNode node, int row, int col, List<int[]> nodes) {
44        if (node == null) return;
45        nodes.add(new int[]{col, row, node.val});
46        dfs(node.left, row + 1, col - 1, nodes);
47        dfs(node.right, row + 1, col + 1, nodes);
48    }
49}
50