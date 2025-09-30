class Solution {
    public int characterReplacement(String s, int k) {
        int left=0; 
        int n=s.length();
        int len=0;
        int count=0;
        int[] freq=new int[26];
        for(int right=0; right<n; right++){
            freq[s.charAt(right)-'A']++;
            count=Math.max(count, freq[s.charAt(right) - 'A']);
            if(right - left + 1 -count > k){
                freq[s.charAt(left)-'A']--;
                left++;
            }
            len=Math.max(len, right-left+1);
        }
        return len;
    }
}