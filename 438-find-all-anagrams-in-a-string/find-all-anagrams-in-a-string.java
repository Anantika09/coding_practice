class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        if(p.length()>s.length()){
            return new ArrayList<>();
        }
        int[] freq=new int[26];
        for(int i=0;i<p.length();i++){
            freq[p.charAt(i)-'a']++;
        }
        int[] arr=new int[26];
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<p.length();i++){
            arr[s.charAt(i)-'a']++;
        }
        int left = 0;
        if(Arrays.equals(freq,arr)){
            list.add(left);
        }
        int right=p.length();
        while(right<s.length()){
            arr[s.charAt(right)-'a']++;  
            arr[s.charAt(left)-'a']--;  
            left++;                         
            right++;
            if(Arrays.equals(freq,arr)){
                list.add(left);
            }
        }
        return list;
    }
}