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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list=new ArrayList<>();
        if(root==null){
            return list;
        }
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        boolean leftToRight = true;
        while(!q.isEmpty()){
            int len=q.size();
            List<Integer> level=new ArrayList<>();
            int count=1;
            for(int i=0;i<len;i++){
                TreeNode n=q.poll();
                level.add(n.val);
                
                if(n.left!=null){
                    q.add(n.left);
                }
                if(n.right!=null){
                    q.add(n.right);
                }
                
                
            }
            if (!leftToRight) {
                Collections.reverse(level);
            }
            list.add(level);
            leftToRight = !leftToRight;
        }
        return list;
    }
}