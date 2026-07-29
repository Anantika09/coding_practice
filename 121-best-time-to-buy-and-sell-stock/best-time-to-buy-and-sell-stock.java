class Solution {
    public int maxProfit(int[] arr) {
        int max=0;
        int min=arr[0];
        int n=arr.length;
        for(int i=0;i<n;i++){
            min=Math.min(min,arr[i]);
            max=Math.max(max,arr[i]-min);
        }
        return max;
    }
}