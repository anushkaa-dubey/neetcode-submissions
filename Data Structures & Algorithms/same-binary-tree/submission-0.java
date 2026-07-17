/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
     if (p == null && q == null) {
            return true;
        }

        // ek null hai aur ek nahi
        if (p == null || q == null) {
            return false;
        }

        // values alag hain
        if (p.val != q.val) {
            return false;
        }

        // current node same hai, ab children check karo
        return isSameTree(p.left, q.left) &&
               isSameTree(p.right, q.right);
    }

}
