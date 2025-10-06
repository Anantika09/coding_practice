class Solution{
    int c=0,e=0,m,n;
    public int uniquePathsIII(int[][] g){
        m=g.length;n=g[0].length;
        int x=0,y=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(g[i][j]==0)e++;
                else if(g[i][j]==1){x=i;y=j;}
            }
        }
        dfs(g,x,y,-1);
        return c;
    }
    void dfs(int[][] g,int i,int j,int s){
        if(i<0||j<0||i>=m||j>=n||g[i][j]==-1)return;
        if(g[i][j]==2){if(s==e)c++;return;}
        int t=g[i][j];
        g[i][j]=-1;
        int[] d={1,0,-1,0,1};
        for(int k=0;k<4;k++)dfs(g,i+d[k],j+d[k+1],s+1);
        g[i][j]=t;
    }
}
