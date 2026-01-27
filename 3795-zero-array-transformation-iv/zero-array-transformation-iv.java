class Solution{
    public int minZeroArray(int[] nums,int[][] queries){
        boolean zero=true;
        for(int v:nums){
            if(v!=0){
                zero=false;
                break;
            }
        }
        if(zero){
            return 0;
        }
        int n=nums.length;
        int m=queries.length;
        for(int k=1;k<=m;k++){
            boolean ok=true;
            for(int i=0;i<n;i++){
                if(nums[i]==0){
                    continue;
                }
                boolean[] dp=new boolean[nums[i]+1];
                dp[0]=true;
                for(int q=0;q<k;q++){
                    int a=queries[q][0];
                    int b=queries[q][1];
                    int c=queries[q][2];
                    if(a<=i&&i<=b){
                        for(int s=nums[i];s>=c;s--){
                            if(dp[s-c]){
                                dp[s]=true;
                            }
                        }
                    }
                }
                if(!dp[nums[i]]){
                    ok=false;
                    break;
                }
            }
            if(ok){
                return k;
            }
        }
        return -1;
    }
}
