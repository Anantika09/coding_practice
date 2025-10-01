class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start=0;
        int end=0;
        int ans=0;
        int freq[]=new int[256];
        int n=s.length();
        while(end<n){
            char ch=s.charAt(end);
            freq[ch]++;
            end++;
            while(start<end && freq[ch]>1){
                char ch2=s.charAt(start);
                freq[ch2]--;
                start++;
            }
            ans=Math.max(ans,end-start);
        }
        return ans;
    }
}