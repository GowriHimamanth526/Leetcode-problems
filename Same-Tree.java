1// Definition for a binary tree node
2class TreeNode {
3    int val;
4    TreeNode left;
5    TreeNode right;
6
7    TreeNode(int val) {
8        this.val = val;
9        this.left = null;
10        this.right = null;
11    }
12}
13
14class Solution {
15
16    public boolean isSameTree(TreeNode p, TreeNode q) {
17        // both null
18        if (p == null && q == null) return true;
19
20        // one null
21        if (p == null || q == null) return false;
22
23        // value mismatch
24        if (p.val != q.val) return false;
25
26        // recursive check
27        return isSameTree(p.left, q.left) &&
28               isSameTree(p.right, q.right);
29    }
30}
31