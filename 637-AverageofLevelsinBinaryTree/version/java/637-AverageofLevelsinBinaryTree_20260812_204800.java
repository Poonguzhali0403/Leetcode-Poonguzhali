// Last updated: 8/12/2026, 8:48:00 PM
1import java.util.*;
2
3class Solution {
4    public List<Double> averageOfLevels(TreeNode root) {
5        List<Double> result = new ArrayList<>();
6        if (root == null) return result;
7
8        Queue<TreeNode> queue = new LinkedList<>();
9        queue.offer(root);
10
11        while (!queue.isEmpty()) {
12            int size = queue.size();
13            long sum = 0; // use long to avoid overflow
14
15            for (int i = 0; i < size; i++) {
16                TreeNode node = queue.poll();
17                sum += node.val;
18
19                if (node.left != null) queue.offer(node.left);
20                if (node.right != null) queue.offer(node.right);
21            }
22
23            result.add((double) sum / size);
24        }
25
26        return result;
27    }
28}
29