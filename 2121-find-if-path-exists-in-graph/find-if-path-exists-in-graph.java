class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        Map<Integer,List<Integer>> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(i,new ArrayList<>());
        }
        for(int[] e:edges){
            map.get(e[0]).add(e[1]);
            map.get(e[1]).add(e[0]);
        }
        boolean[] vis=new boolean[n];
        Queue<Integer> q=new LinkedList<>();
        q.add(source);
        vis[source]=true;
        while(!q.isEmpty()){
            int u=q.poll();
            if(u==destination){
                return true;
            }
            for(int v:map.get(u)){
                if(!vis[v]){
                    vis[v]=true;
                    q.add(v);
                }
            }
        }
        return false;
    }
}