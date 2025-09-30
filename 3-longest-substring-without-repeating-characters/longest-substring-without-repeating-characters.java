class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set=new HashSet<>();
        int i=0; 
        int max=0;
        for(int j=0;j<s.length();j++){
            char ch=s.charAt(j);
            while(set.contains(ch)){
                set.remove(s.charAt(i));
                i++;
            }
            set.add(ch);
            max=Math.max(max,j-i+1);
        }
        return max;
    }
}

