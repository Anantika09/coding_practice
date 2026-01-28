class Solution {
    public int boxDelivering(int[][] boxes, int portsCount, int maxBoxes, int maxWeight) {
        int n=boxes.length;
        int[] dp=new int[n+1];
        int[] port=new int[n+1];
        int[] wt=new int[n+1];
        int[] diff=new int[n+2];
        long[] pre=new long[n+1];
        for(int i=1;i<=n;i++){
            port[i]=boxes[i-1][0];
            wt[i]=boxes[i-1][1];
            pre[i]=pre[i-1]+wt[i];
            diff[i]=diff[i-1]+(i==1 || port[i]!=port[i-1] ? 1 : 0);
        }
        Deque<Integer> dq=new ArrayDeque<>();
        dq.add(0);
        for(int i=1;i<=n;i++){
            while(!dq.isEmpty() && (i-dq.peekFirst()>maxBoxes || pre[i]-pre[dq.peekFirst()] > maxWeight)) {
                dq.pollFirst();
            }
            int j=dq.peekFirst();
            dp[i]=dp[j]+diff[i]-diff[j+1]+2;
            if(i<n){
                int val=dp[i]-diff[i+1];
                while(!dq.isEmpty() && dp[dq.peekLast()]-diff[dq.peekLast()+1]>=val){
                    dq.pollLast();
                }
                dq.addLast(i);
            }
        }
        return dp[n];
    }
}
