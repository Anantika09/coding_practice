class Solution {
    public int findCircleNum(int[][] isConnected) {
        int visited[]=new int[isConnected.length];
        int ans=0;
        for(int i=0;i<isConnected.length;i++){
            if(visited[i]==0){
                ans++;
                dfs(i,visited,isConnected);
            }
        }
        return ans;
    }
    public void dfs(int i, int visited[], int connect[][]){
        visited[i]=1;
        for(int j=0;j<connect.length;j++){
            if(visited[j]==0 && connect[i][j]==1){
                dfs(j,visited,connect);
            }
        }
    }
}