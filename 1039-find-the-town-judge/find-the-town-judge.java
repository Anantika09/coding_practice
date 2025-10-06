class Solution {
    public int findJudge(int n,int[][] t){
        int[] in=new int[n+1],out=new int[n+1];
        for(int[] x:t){
            out[x[0]]++;
            in[x[1]]++;
        }
        for(int i=1;i<=n;i++)
            if(out[i]==0 && in[i]==n-1) return i;
        return -1;
    }
}
