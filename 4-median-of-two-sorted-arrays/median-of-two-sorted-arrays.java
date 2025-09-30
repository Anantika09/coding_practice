class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        List<Integer> res=sortedMerge(nums1,nums2);
        int size=res.size();
        if(size%2==0){
            return(res.get(size/2-1)+res.get(size/2))/2.0;
        } 
        else{
            return res.get(size/2);
        }
    }

    public static List<Integer> sortedMerge(int[] arr1, int[] arr2) {
        List<Integer> res=new ArrayList<>();
        for(int n:arr1){
            res.add(n);
        }
        for(int n:arr2){
            res.add(n);
        }
        Collections.sort(res);
        return res;
    }
}