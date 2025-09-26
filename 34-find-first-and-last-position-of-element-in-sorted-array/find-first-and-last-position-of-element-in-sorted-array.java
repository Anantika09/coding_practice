class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result={0,0};
        int first=firstoccurence(nums,target);
        int last=lastoccurence(nums,target);
        result[0]=first;
        result[1]=last;
        return result;
    }
    public static int firstoccurence(int[] arr,int k){
        int first=0;
        int last=arr.length-1;
        int temp=-1;
        while(first<=last){
            int mid=first+(last-first)/2;
            if(arr[mid]==k){
                temp=mid;
                last=mid-1;
            }
            else if(arr[mid]<k){
                first=mid+1;
            }
            else{
                last=mid-1;
            }
        }
        return temp;
    }
    public static int lastoccurence(int[] arr,int k){
        int first=0;
        int last=arr.length-1;
        int temp=-1;
        while(first<=last){
            int mid=first+(last-first)/2;
            if(arr[mid]==k){
                temp=mid;
                first=mid+1;
            }
            else if(arr[mid]<k){
                first=mid+1;
            }
            else{
                last=mid-1;
            }
        }
        return temp;
    }
}