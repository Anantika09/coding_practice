class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max=0;
        for(int i=0;i<s.length();i++){
            ArrayList<Character> ans=new ArrayList<>();
            for(int j=i;j<s.length();j++){
                if(!ans.contains(s.charAt(j))){
                    ans.add(s.charAt(j));
                    max=Math.max(max,ans.size());
                }
                else{
                    break;
                }
            }
        }
        return max;
    }
}