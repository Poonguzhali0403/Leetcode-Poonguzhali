// Last updated: 8/12/2026, 6:43:07 PM
1class Solution {
2    public List<Integer> postorderTraversal(TreeNode root) {
3        List<Integer> result = new ArrayList<>();
4        traverse(root, result);
5        return result;
6    }
7
8    private void traverse(TreeNode node, List<Integer> result) {
9        if (node == null) return;
10        traverse(node.left, result);
11        traverse(node.right, result);
12        result.add(node.val);
13    }
14}
15