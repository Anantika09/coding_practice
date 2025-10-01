class Solution {
    public int characterReplacement(String s, int k) {
        int n=s.length();
        int start=0;
        int end=0;
        int ans=0;
        int count=0;
        int[] freq=new int[26];
        while(end<n){
            freq[s.charAt(end)-'A']++;
            count=Math.max(count,freq[s.charAt(end)-'A']);
            if((end-start+1)-count>k){
                freq[s.charAt(start)-'A']--;
                start++;
            }
            ans=Math.max(ans,end-start+1);
            end++;
        }
        return ans;
    }
}