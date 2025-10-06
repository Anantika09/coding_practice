class Solution{
    List<List<Integer>> r=new ArrayList<>();
    public List<List<Integer>> permute(int[] n){
        f(n,new boolean[n.length],new ArrayList<>());
        return r;
    }
    void f(int[] n,boolean[] u,List<Integer> p){
        if(p.size()==n.length){r.add(new ArrayList<>(p));return;}
        for(int i=0;i<n.length;i++){
            if(u[i])continue;
            u[i]=true;p.add(n[i]);
            f(n,u,p);
            u[i]=false;p.remove(p.size()-1);
        }
    }
}
