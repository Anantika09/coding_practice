class Solution {
    public int reverseBits(int n) {
        String str = Integer.toBinaryString(n);
        int m = str.length();
        for(int i=0; i<32-m;i++){
            str='0'+str;
        }
        String newstr = "";
        for(int i=str.length()-1; i>=0; i--){
            newstr+=str.charAt(i);
        }
        return Integer.parseInt(newstr,2);
    }
}