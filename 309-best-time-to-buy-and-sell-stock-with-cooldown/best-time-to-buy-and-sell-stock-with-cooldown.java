class Solution{
    public int maxProfit(int[] prices){
        int n=prices.length;
        int dp[][]=new int[n][2];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        return func(prices,0,0,dp);
    }

    int func(int[] arr,int i,int buy,int[][] dp){
        if(i>=arr.length){
            return 0;
        }
        if(dp[i][buy]!=-1){
            return dp[i][buy];
        }
        if(buy==0){
            int a=func(arr,i+1,1,dp)-arr[i];
            int b=func(arr,i+1,0,dp);
            dp[i][buy]=Math.max(a,b);
        }
        else{
            int a=func(arr,i+2,0,dp)+arr[i];
            int b=func(arr,i+1,1,dp);
            dp[i][buy]=Math.max(a,b);
        }
        return dp[i][buy];
    }
}