class Solution {
    public long countNonDecreasingSubarrays(int[] nums, int k) {
        Deque<int []> dq=new LinkedList<>();
        int i=nums.length-1;
        int j=nums.length-1;
        long op=0;
        long ans=0;
        while(i>-1){
            int p=0;
            while(dq.size()>0 && dq.peekFirst()[0]<=nums[i]){
                int [] r=dq.poll();
                p+=r[1];
                op+=(long)r[1]*(long)(nums[i]-r[0]);    
            }
            dq.offerFirst(new int[] {nums[i],p+1});
            if(op<=(long)k){
                ans+=(long)(j-i+1);
            }
            else{
                while(i<j && op>(long)k){
                    int [] r= dq.pollLast();
                    op-= (long)(r[0]-nums[j]);
                    r[1]--;
                    if(r[1] != 0){
                        dq.offerLast(r);
                    }
                    j--;
                }
                if(op<= (long) k){
                    ans+=(long)(j-i+1);
                }
            }
            i--;
        }
        return ans;

    }
}