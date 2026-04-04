class Solution {
    public String decodeCiphertext(String encodedText, int row) {
        int n = encodedText.length();
        int col = n / row;

        StringBuilder res = new StringBuilder();

        for(int k = 0; k < col; k++){
            int r = 0, c = k;
            while(r < row && c < col){
                res.append(encodedText.charAt(r * col + c));
                r++;
                c++;
            }
        }

        while(res.length() > 0 && res.charAt(res.length() - 1) == ' '){
            res.deleteCharAt(res.length() - 1);
        }

        return res.toString();
    }
}