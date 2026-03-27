1class TreeNode {
2    int val;
3    TreeNode left;
4    TreeNode right;
5
6    TreeNode(int val) {
7        this.val = val;
8    }
9}
10
11class Solution {
12
13    public boolean isSymmetric(TreeNode root) {
14        if (root == null) return true;
15        return isMirror(root.left, root.right);
16    }
17
18    private boolean isMirror(TreeNode t1, TreeNode t2) {
19        // both null
20        if (t1 == null && t2 == null) return true;
21
22        // one null
23        if (t1 == null || t2 == null) return false;
24
25        // values must match + mirror structure
26        return (t1.val == t2.val)
27                && isMirror(t1.left, t2.right)
28                && isMirror(t1.right, t2.left);
29    }
30}