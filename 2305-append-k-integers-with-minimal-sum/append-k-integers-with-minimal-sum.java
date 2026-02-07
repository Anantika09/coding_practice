class Solution{
    public long minimalKSum(int[] nums,int k){
        Arrays.sort(nums);
        long ans=0;
        long cur=1;
        for(int i=0;i<nums.length&&k>0;i++){
            if(nums[i]<cur){
                continue;
            }
            if(nums[i]>cur){
                long cnt=Math.min(k,nums[i]-cur);
                ans+=(cur+cur+cnt-1)*cnt/2;
                k-=cnt;
            }
            cur=nums[i]+1;
        }

        if(k>0){
            ans+=(cur+cur+k-1)*k/2;
        }
        return ans;
    }
}
