class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {
        Set<String> b=new HashSet<>();
        for(int[] o:obstacles){
            b.add(o[0]+ "," +o[1]);
        }
        int[][] dir={{0,1},{1,0},{0,-1},{-1,0}};
        int x=0,y=0;
        int d=0; 
        int max=0;
        for(int c:commands){
            if(c==-1){
                d=(d+1)%4;
            } 
            else if(c==-2){
                d=(d+3)%4; 
            } 
            else{
                while(c-->0){
                    int nx=x+dir[d][0];
                    int ny=y+dir[d][1];
                    if(b.contains(nx+","+ny)){
                        break;
                    }
                    x=nx;
                    y=ny;
                    max=Math.max(max,x*x+y*y);
                }
            }
        }
        return max;
    }
}