class Solution{
    public boolean wordBreak(String s,List<String> wordDict){
        HashSet<String> set=new HashSet<>(wordDict);
        Boolean[] dp=new Boolean[s.length()];
        return solve(set,s,0,dp);
    }
    public boolean solve(HashSet<String> set,String s,int sin,Boolean[] dp){
        if(sin==s.length()) return true;
        if(dp[sin]!=null) return dp[sin];
        for(int i=sin+1;i<=s.length();i++){
            String str=s.substring(sin,i);
            if(set.contains(str)){
                if(solve(set,s,i,dp)){
                    return dp[sin]=true;
                }
            }
        }
        return dp[sin]=false;
    }
}