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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans=new ArrayList<>();
        fun(root,targetSum,0,new ArrayList<>(),ans);
        return ans;
    }
    void fun(TreeNode root,int target,int sum,List<Integer> path,List<List<Integer>>ans){
        if(root==null){
            return;
        }
        sum+=root.val;
        path.add(root.val);
        if(root.left==null && root.right==null){
            if(sum==target){
                ans.add(new ArrayList<>(path));
            }
        }
        fun(root.left,target,sum,path,ans);
        fun(root.right,target,sum,path,ans);
        path.remove(path.size()-1);
    }
}