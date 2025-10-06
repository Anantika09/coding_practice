class Solution{
    public long minimumTime(int[] t,long tt){
        long l=1,r=100000000000000L; 
        while(l<r){
            long m=l+(r-l)/2,sum=0;
            for(int x:t) sum += m/x;
            if(sum>=tt) r=m;
            else l=m+1;
        }
        return l;
    }
}

