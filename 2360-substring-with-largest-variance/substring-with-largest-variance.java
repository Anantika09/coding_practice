class Solution{
    public int largestVariance(String s){
        int n=s.length();
        int[] freq=new int[26];
        for(int i=0;i<n;i++){
            freq[s.charAt(i)-'a']++;
        }
        int ans=0;
        for(int x=0;x<26;x++){
            for(int y=0;y<26;y++){
                if(x==y||freq[x]==0||freq[y]==0){
                    continue;
                }
                int cx=0;
                int cy=0;
                int remY=freq[y];
                for(int i=0;i<n;i++){
                    int c=s.charAt(i)-'a';
                    if(c==x){
                        cx++;
                    }
                    if(c==y){
                        cy++;
                        remY--;
                    }

                    if(cy>0)ans=Math.max(ans,cx-cy);

                    if(cx-cy<0&&remY>0){
                        cx=0;
                        cy=0;
                    }
                }
            }
        }
        return ans;
    }
}
