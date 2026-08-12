// Last updated: 8/12/2026, 6:45:47 PM
1class Solution {
2    public List<String> binaryTreePaths(TreeNode root) {
3        List<String> result = new ArrayList<>();
4        if (root == null) return result;
5        dfs(root, "", result);
6        return result;
7    }
8
9    private void dfs(TreeNode node, String path, List<String> result) {
10        if (node == null) return;
11
12        // Build current path
13        path += node.val;
14
15        // If leaf → add path
16        if (node.left == null && node.right == null) {
17            result.add(path);
18        } else {
19            path += "->";
20            dfs(node.left, path, result);
21            dfs(node.right, path, result);
22        }
23    }
24}
25