// Last updated: 9/3/2026, 9:42:09 AM
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode(int x) { val = x; }
8 * }
9 */
10public class Codec {
11
12    // Encodes a tree to a single string.
13    public String serialize(TreeNode root) {
14        StringBuilder sb = new StringBuilder();
15        serializeHelper(root, sb);
16        return sb.toString();
17    }
18
19    private void serializeHelper(TreeNode node, StringBuilder sb) {
20        if (node == null) {
21            sb.append("null,");
22            return;
23        }
24        sb.append(node.val).append(",");
25        serializeHelper(node.left, sb);
26        serializeHelper(node.right, sb);
27    }
28
29    // Decodes your encoded data to tree.
30    public TreeNode deserialize(String data) {
31        String[] values = data.split(",");
32        Queue<String> queue = new LinkedList<>(Arrays.asList(values));
33        return deserializeHelper(queue);
34    }
35
36    private TreeNode deserializeHelper(Queue<String> queue) {
37        String val = queue.poll();
38        if (val.equals("null")) {
39            return null;
40        }
41        TreeNode node = new TreeNode(Integer.parseInt(val));
42        node.left = deserializeHelper(queue);
43        node.right = deserializeHelper(queue);
44        return node;
45    }
46}
47