class Solution {
    public int jobScheduling(int[] s, int[] e, int[] p) {
        int n=s.length;
        int[][] a=new int[n][3];
        for(int i=0;i<n;i++){
            a[i][0]=s[i];
            a[i][1]=e[i];
            a[i][2]=p[i];
        }
        Arrays.sort(a,(x,y)->x[1]-y[1]);
        int[] dp=new int[n];
        dp[0]=a[0][2];
        for(int i=1;i<n;i++){
            int cur=a[i][2];
            int l=0,r=i-1,idx=-1;
            while(l<=r){
                int m=(l+r)/2;
                if(a[m][1]<=a[i][0]){
                    idx=m;
                    l=m+1;
                } 
                else{
                    r=m-1;
                }
            }
            if(idx!=-1){
                cur+=dp[idx];
            }
            dp[i]=Math.max(dp[i-1],cur);
        }
        return dp[n-1];
    }
}