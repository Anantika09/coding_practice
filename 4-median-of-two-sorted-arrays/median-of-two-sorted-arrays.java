class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> res=new ArrayList<>();
        for(int n:nums1){
            res.add(n);
        }
        for(int n:nums2){
            res.add(n);
        }
        Collections.sort(res);
        int size=res.size();
        if(size%2==0){
            return(res.get(size/2-1)+res.get(size/2))/2.0;
        } 
        else{
            return res.get(size/2);
        }
    }
}
