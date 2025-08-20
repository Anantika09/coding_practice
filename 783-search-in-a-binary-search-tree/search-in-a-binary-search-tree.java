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
    int value = 0;
    public TreeNode searchBST(TreeNode root, int val) {
        value = val;
        return getNode(root);
    }
    TreeNode getNode(TreeNode root) {
        if(root != null) {
            if(root.val == value) {
                return root;
            }else if(root.val > value) {
                return getNode(root.left);
            } else if(root.val < value) {
                return getNode(root.right);
            } else {
                return null;
            }
        } else return null;
    }
}