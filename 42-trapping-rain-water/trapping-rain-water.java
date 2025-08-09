class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int left=height[0];
        int right=height[n-1];
        int l=1;
        int r=n-2;
        int res=0;
        while(l<=r){
            if(left<right){
                left=Math.max(left,height[l]);
                res=res+left-height[l];
                l++;
            }
            else{
                right=Math.max(right,height[r]);
                res=res+right-height[r];
                r--;
            }

        }
        return res;
    }
}