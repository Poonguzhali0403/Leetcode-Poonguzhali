// Last updated: 8/12/2026, 8:51:08 PM
1class Solution {
2    public boolean isSameTree(TreeNode p, TreeNode q) {
3        // Case 1: both are null → same
4        if (p == null && q == null) return true;
5        
6        // Case 2: one is null, the other is not → different
7        if (p == null || q == null) return false;
8        
9        // Case 3: values differ → different
10        if (p.val != q.val) return false;
11        
12        // Case 4: check left and right subtrees
13        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
14    }
15}
16