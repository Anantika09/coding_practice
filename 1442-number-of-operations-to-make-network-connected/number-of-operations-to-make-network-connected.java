class Solution {
    public int makeConnected(int n, int[][] connections) {
        if(connections.length<n-1){
            return -1;
        }
        List<List<Integer>> graph=new ArrayList<>();
        for(int i=0;i<n;i++){
            graph.add(new ArrayList<>());
        }
        for(int[] e:connections){
            graph.get(e[0]).add(e[1]);
            graph.get(e[1]).add(e[0]);
        }
        int[] visited=new int[n];
        int ans=0;
        for(int i=0;i<n;i++){
            if(visited[i]==0){
                ans++;
                bfs(i,visited,graph);
            }
        }
        return ans-1;
    }
    public void bfs(int i, int visited[], List<List<Integer>> graph){
        Queue<Integer> q=new LinkedList<>();
        q.add(i);
        visited[i]=1;
        while(!q.isEmpty()){
            int node=q.poll();
             for(int nei:graph.get(node)){
                if(visited[nei]==0){
                    visited[nei]=1;
                    q.add(nei);
                }
            }
        }
    }
}