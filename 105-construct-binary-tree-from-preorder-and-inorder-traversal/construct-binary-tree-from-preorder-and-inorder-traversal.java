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
    int pre=0;
    HashMap<Integer,Integer> map=new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
       for(int i=0;i<inorder.length;i++){
        map.put(inorder[i],i);
       }
       return build(preorder,0,inorder.length-1);
    }
    private TreeNode build(int[] preorder,int start,int end){
        if(start>end){
            return null;
        }
        //pick root from preorder
        int rootval=preorder[pre++];
        TreeNode root=new TreeNode(rootval);
        //find root in inorder
        int idx=map.get(rootval);
        //build left subtree
        root.left=build(preorder,start,idx-1);
        ///build right subtree
        root.right=build(preorder,idx+1,end);
        return root;
    }
}