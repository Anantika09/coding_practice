class Solution{
    public int maximumLength(String s){
        int n=s.length();
        int[][] cnt=new int[26][3];
        int i=0;

        while(i<n){
            int j=i;
            while(j<n&&s.charAt(j)==s.charAt(i)){
                j++;
            }
            int len=j-i;
            int c=s.charAt(i)-'a';

            if(len>cnt[c][0]){
                cnt[c][2]=cnt[c][1];
                cnt[c][1]=cnt[c][0];
                cnt[c][0]=len;
            }
            else if(len>cnt[c][1]){
                cnt[c][2]=cnt[c][1];
                cnt[c][1]=len;
            }
            else if(len>cnt[c][2]){
                cnt[c][2]=len;
            }
            i=j;
        }

        int ans=-1;
        for(i=0;i<26;i++){
            ans=Math.max(ans,cnt[i][0]-2);
            ans=Math.max(ans,Math.min(cnt[i][0]-1,cnt[i][1]));
            ans=Math.max(ans,cnt[i][2]);
        }
        return ans<=0?-1:ans;
    }
}
