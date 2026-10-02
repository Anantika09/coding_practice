class Solution {
    public boolean checkIfPangram(String sentence) {
        int n=sentence.length();
        if(n<26) return false;
        int[] f=new int[26];
        for(int i=0;i<n;i++){
            char c=sentence.charAt(i);
            f[c-'a']++;
        }
        for(int i=0;i<f.length;i++){
            if(f[i]==0){
                return false;
            }
        }
        return true;
    }
}