class Solution {
    public int numTeams(int[] rating) {
        int n=rating.length;
        int ans=0;
        for(int j=0;j<n;j++){
            int ls=0;
            int lb=0;
            int rs=0;
            int rb=0;
            for(int i=0;i<j;i++){
                if(rating[i]<rating[j]){
                    ls++;
                }
                else lb++;
            }

            for(int k=j+1;k<n;k++){
                if(rating[k]>rating[j]) {
                    rb++;
                }
                else rs++;
            }

            ans+=ls*rb;
            ans+=lb*rs;
        }
        return ans;
    }
}
