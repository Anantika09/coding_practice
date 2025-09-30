class Solution {
    public int maxDistance(int[] arr, int m) {
        Arrays.sort(arr);
        int n=arr.length;
        int ans=0;
        int start=0;
        int end=arr[n-1]-arr[0];
        while(start<=end){
            int mid=start+(end-start)/2;
            int c=arrange(arr,mid);
            if(c<m){
                end=mid-1;
            }
            else{
                ans=mid;
                start=mid+1;
            }
        }
        return ans;
        
    }
    int arrange(int[] pos,int m){
        int count=1;
        int prev=pos[0];
        for(int i=0;i<pos.length;i++){
            if(pos[i]-prev>=m){
                count++;
                prev=pos[i];
            }
        }
        return count;
    }
}