class Solution {
    public boolean asteroidsDestroyed(int m, int[] a) {
        Arrays.sort(a);
        long curr=m;
        for(int i:a){
            if(i>curr){
                return false;
            }
            curr+=i;
        }
        return true;
    }
}