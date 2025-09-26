class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int ans=maxsubarray(nums);
        int total_sum=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            total_sum+=nums[i];
            nums[i]=(-1)*nums[i];
        }
        int sum2=maxsubarray(nums);
        int last=total_sum+sum2;
        if(last==0){
            return ans;
        }
        return Math.max(ans,last);
    }
    public int maxsubarray(int[] nums){
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i:nums){
            sum+=i;
            max=Math.max(sum,max);
            if(sum<0){
                sum=0;
            }
        }
        return max;
    }
}