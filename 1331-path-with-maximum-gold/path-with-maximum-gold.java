class Solution{
    int m,n,res;
    int[][] d={{1,0},{-1,0},{0,1},{0,-1}};
    public int getMaximumGold(int[][] g){
        m=g.length;n=g[0].length;res=0;
        for(int i=0;i<m;i++)
            for(int j=0;j<n;j++)
                if(g[i][j]>0)dfs(g,i,j,0);
        return res;
    }
    void dfs(int[][] g,int i,int j,int sum){
        if(i<0||j<0||i>=m||j>=n||g[i][j]==0)return;
        int v=g[i][j];
        g[i][j]=0;
        sum+=v;
        res=Math.max(res,sum);
        for(int[] x:d)dfs(g,i+x[0],j+x[1],sum);
        g[i][j]=v;
    }
}
