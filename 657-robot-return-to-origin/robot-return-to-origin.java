class Solution {
    public boolean judgeCircle(String moves) {
        int x=0;
        int y=0;
        for(char m:moves.toCharArray()){
            if(m=='R'){
                x++;
            }
            else if(m=='L'){
                x--;
            }
            else if(m=='U'){
                y++;
            }
            else if(m=='D'){
                y--;
            }
        }
        if(x==0 && y==0){
            return true;
        }
        return false;
    }
}