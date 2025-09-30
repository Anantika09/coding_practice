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

       int[] sortedMerge(int[] arr1, int[] arr2) {
        int n=arr1.length;
        int m=arr2.length;
        int res[]=new int [m+n];
        int i=0,j=0,k=0;
        while(i<n && j<m){
            if(arr1[i]<arr2[j]){
                res[k]=arr1[i];
                i++;
            }
            else{
                res[k]=arr2[j];
                j++;
            }
            k++;
        }
        while(i<n){
            res[k++]=arr1[i++];
        }
        while(j<m){
            res[k++]=arr2[j++];
        }
        return res;
    }
}