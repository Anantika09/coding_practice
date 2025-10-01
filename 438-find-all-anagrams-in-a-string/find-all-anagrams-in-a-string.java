class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans=new ArrayList<>();
        if(p.length()>s.length()){
            return ans;
        }
        int[] freq1=new int[26];
        int[] freq2=new int[26];
        for(int i=0;i<p.length();i++){
            freq1[p.charAt(i)-'a']++;
            freq2[s.charAt(i)-'a']++;
        }
        if(Arrays.equals(freq1,freq2)){
            ans.add(0);
        }
        for(int k=p.length();k<s.length();k++){
            freq2[s.charAt(k)-'a']++;
            freq2[s.charAt(k-p.length())-'a']--;
            if(Arrays.equals(freq1,freq2)){
                ans.add(k-p.length()+1);
            }
        }
        return ans;
    }
}