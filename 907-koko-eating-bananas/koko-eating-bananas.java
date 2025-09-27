class Solution {
    public int minEatingSpeed(int[] arr, int h) {
        Arrays.sort(arr);
        int start=1;
        int end=arr[arr.length-1];
        int ans=end;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(check(arr,h,mid)<=h){
                end=mid-1;
                ans=mid;
            }
            else{
                start=mid+1;
            }

        }
        return ans;
    }
    public long check(int[] arr,int h,int mid){
        long sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=(arr[i]+mid-1)/mid;
        }
        return sum;
    }
}