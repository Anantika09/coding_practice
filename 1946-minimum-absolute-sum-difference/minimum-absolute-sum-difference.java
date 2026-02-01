class Solution {
    public int minAbsoluteSumDiff(int[] a, int[] b) {
        int n = a.length;
        int mod = 1000000007;
        int[] c = new int[n];
        for (int i=0;i<n;i++){
            c[i]=a[i];
        }
        Arrays.sort(c);
        long sum=0;
        long dec=0;
        for(int i=0;i<n;i++){
            long d=Math.abs(a[i]-b[i]);
            sum=(sum+d)%mod;
            int x=b[i];
            int l=0,r=n-1;
            while(l<=r){
                int m=(l+r)/2;
                if(c[m]<x){
                    l=m+1;
                }
                else{
                    r=m-1;
                }
            }
            if(l<n){
                dec=Math.max(dec,d-Math.abs(c[l]-x));
            }
            if(l>0){
                dec=Math.max(dec,d-Math.abs(c[l-1]-x));
            }
        }
        return (int)((sum-dec+mod)%mod);
    }
}