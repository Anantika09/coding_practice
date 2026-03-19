class Solution {
    public int findCircleNum(int[][] isConnected) {
        int visited[]=new int[isConnected.length];
        int ans=0;
        for(int i=0;i<isConnected.length;i++){
            if(visited[i]==0){
                ans++;
                bfs(i,visited,isConnected);
            }
        }
        return ans;
    }
    public void bfs(int i, int visited[], int connect[][]){
        boolean[] vis=new boolean[i];
        Queue<Integer> q=new LinkedList<>();
        q.add(i);
        visited[i]=1;
        while(!q.isEmpty()){
            int node=q.poll();
            for(int j=0;j<connect.length;j++){
                if(connect[node][j]==1 && visited[j]==0){
                    visited[j]=1;
                    q.add(j);
                }
            }
        }
    }
}