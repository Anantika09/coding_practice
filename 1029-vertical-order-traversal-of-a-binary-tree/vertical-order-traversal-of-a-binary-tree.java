class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root){
        List<List<Integer>> res=new ArrayList<>();
        if(root==null){
            return res;
        }
        TreeMap<Integer,TreeMap<Integer,PriorityQueue<Integer>>> map=new TreeMap<>();
        Queue<TreeNode> q=new LinkedList<>();
        Queue<int[]> pos=new LinkedList<>();
        q.add(root);
        pos.add(new int[]{0,0}); // col, row
        while(!q.isEmpty()){
            TreeNode node=q.poll();
            int[] p=pos.poll();
            int col=p[0];
            int row=p[1];
            map.putIfAbsent(col,new TreeMap<>());
            map.get(col).putIfAbsent(row,new PriorityQueue<>());
            map.get(col).get(row).add(node.val);
            if(node.left!=null){
                q.add(node.left);
                pos.add(new int[]{col-1,row+1});
            }
            if(node.right!=null){
                q.add(node.right);
                pos.add(new int[]{col+1,row+1});
            }
        }
        for(TreeMap<Integer,PriorityQueue<Integer>> rows:map.values()){
            List<Integer> list=new ArrayList<>();
            for(PriorityQueue<Integer> pq:rows.values()){
                while(!pq.isEmpty()){
                    list.add(pq.poll());
                }
            }
            res.add(list);
        }
        return res;
    }
}