class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> merge=new ArrayList<>();
        for(int n:nums1){
            merge.add(n);
        }
        for(int n:nums2){
            merge.add(n);
        }
        Collections.sort(merge);
        int m=merge.size();
        if(m%2==0){
            return (double)(merge.get(m/2-1)+merge.get(m/2))/2;
        }
        else{
            return merge.get(m/2);
        }
    }
}