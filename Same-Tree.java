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
13    public boolean isSameTree(TreeNode p, TreeNode q) {
14        // both null → same
15        if (p == null && q == null) return true;
16
17        // one null → not same
18        if (p == null || q == null) return false;
19
20        // values must match + subtrees must match
21        return (p.val == q.val)
22                && isSameTree(p.left, q.left)
23                && isSameTree(p.right, q.right);
24    }
25}