import java.util.*;
class Solution{
    public int threeSumClosest(int[] a,int t){
        Arrays.sort(a);
        int n=a.length,res=a[0]+a[1]+a[2];
        for(int i=0;i<n-2;i++){
            int l=i+1,r=n-1;
            while(l<r){
                int s=a[i]+a[l]+a[r];
                if(Math.abs(s-t)<Math.abs(res-t)) res=s;
                if(s<t) l++;
                else r--;
            }
        }
        return res;
    }
}
