class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int[] res=sortedMerge(nums1,nums2);
        double ans=0;
        if(res.length==2){
            
        }
        if(res.length%2==0){
            return (double)(res[(res.length/2)-1]+res[res.length/2])/2;
        }
        return (double)res[res.length/2];
    }

    public static int[] sortedMerge(int[] arr1, int[] arr2) {
        int n=arr1.length;
        int m=arr2.length;
        int[] res=new int[m+n];
        System.arraycopy(arr1,0,res,0,n);
        System.arraycopy(arr2,0,res,n,m);
        Arrays.sort(res);
        return res;
    }
}