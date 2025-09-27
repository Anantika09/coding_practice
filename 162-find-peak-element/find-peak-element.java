class Solution {
    public int findPeakElement(int[] arr) {
        int maxVal=Integer.MIN_VALUE;
        int maxIndex=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>maxVal){
                maxVal=arr[i];
                maxIndex=i;
            }
        }
        return maxIndex;
    }
}
