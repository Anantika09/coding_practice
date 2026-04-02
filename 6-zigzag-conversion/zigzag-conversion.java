class Solution {
    public String convert(String s, int numRows) {
       if(numRows==1 || numRows>=s.length()){
            return s;
        }
        int idx=0;
        int d=1;
        List<Character>[] rows=new ArrayList[numRows];
        for(int i=0;i<numRows;i++) {
            rows[i]=new ArrayList<>();
        }
        for(char c:s.toCharArray()){
            rows[idx].add(c);
            if(idx==0){
                d=1;
            } 
            else if(idx==numRows-1){
                d=-1;
            }
            idx+=d;
        }
        StringBuilder res=new StringBuilder();
        for(List<Character> r:rows){
            for(char c:r) {
                res.append(c);
            }
        }
        return res.toString();        
    }
}