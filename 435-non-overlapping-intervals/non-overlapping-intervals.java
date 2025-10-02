class Solution {
    public int eraseOverlapIntervals(int[][] a) {
       if(a.length==1) return 0;
       Arrays.sort(a,(c,b)->c[1]-b[1]);
       int count=0;
       int prev=a[0][1];
       for(int i=0;i<a.length-1;i++){
            if(prev>a[i+1][0]) {
                count++;
            }
            else prev=a[i+1][1];
       }
       return count;
    }
}