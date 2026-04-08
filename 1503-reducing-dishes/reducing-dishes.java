class Solution {
    public int maxSatisfaction(int[] arr) {
        Arrays.sort(arr);
        int n=arr.length;
        int ans=0;
        for(int i=0;i<n;i++){
            int time=1;
            int curr=0;
            for(int j=i;j<n;j++){
                curr+=arr[j]*time;
                time++;
            }
            ans=Math.max(ans,curr);
        }
        return ans;
    }
}