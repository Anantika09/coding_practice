class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        TreeMap<Integer,TreeMap<Integer,List<Integer>>> m=new TreeMap<>();
        fun(root,m,0,0);
        List<List<Integer>> ans=new ArrayList<>();
        for(int p:m.keySet()){
            List<Integer> l=new ArrayList<>();
            TreeMap<Integer,List<Integer>> level=m.get(p);
            for(List<Integer> nodes:level.values()){
                Collections.sort(nodes);
                l.addAll(nodes);
            }
            ans.add(l);
        }
        return ans;
    }
    void fun(TreeNode root,TreeMap<Integer,TreeMap<Integer,List<Integer>>> m,int r,int c){
        if(root==null) return;
        TreeMap<Integer,List<Integer>> p=m.computeIfAbsent(c,k->new TreeMap<>());
        List<Integer> l=p.computeIfAbsent(r,k->new ArrayList<>());
        l.add(root.val);
        fun(root.left,m,r+1,c-1);
        fun(root.right,m,r+1,c+1);
    }
}