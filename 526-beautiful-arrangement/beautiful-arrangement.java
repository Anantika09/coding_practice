class Solution{
    int c=0;
    public int countArrangement(int n){
        boolean[] v=new boolean[n+1];
        dfs(n,1,v);
        return c;
    }
    void dfs(int n,int i,boolean[] v){
        if(i>n){c++;return;}
        for(int j=1;j<=n;j++){
            if(!v[j]&&(j%i==0||i%j==0)){
                v[j]=true;
                dfs(n,i+1,v);
                v[j]=false;
            }
        }
    }
}
