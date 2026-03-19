class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
      List<List<Integer>> l=new ArrayList<>();
      List<Integer> path=new ArrayList<>();
      dfs(0,graph,l,path);
      return l;

    }
    void dfs(int src,int[][] graph,List<List<Integer>> l,List<Integer> path){
        path.add(src);
        if(src==graph.length-1){
            l.add(new ArrayList<>(path));
        }
        for(int nb:graph[src]){
            dfs(nb,graph,l,path);
        }
        path.remove(path.size()-1);
    }
}