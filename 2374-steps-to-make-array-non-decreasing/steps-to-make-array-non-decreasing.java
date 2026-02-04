class Solution {
    public int totalSteps(int[] nums) {
        int n=nums.length;
        Stack<int[]> st=new Stack<>();
        int ans=0;
        for(int i=n-1;i>=0;i--){
            int cnt=0;
            while(!st.isEmpty() && nums[i]>st.peek()[0]){
                cnt=Math.max(cnt+1,st.pop()[1]);
            }
            ans=Math.max(ans,cnt);
            st.push(new int[]{nums[i],cnt});
        }
        return ans;
    }
}