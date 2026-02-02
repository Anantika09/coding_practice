class Solution{
    public int countHousePlacements(int n){
        int mod=1000000007;
        long a=1;
        long b=1;
        for(int i=0;i<n;i++){
            long c=(a+b)%mod;
            a=b;
            b=c;
        }
        long temp=b;
        long ans=(temp*temp)%mod;
        return (int)ans;
    }
}
