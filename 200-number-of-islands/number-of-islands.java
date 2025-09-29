class Solution {
    public int numIslands(char[][] grid) {
        int count=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1'){
                    count++;
                    clear(grid,i,j);
                }
            }
        }
        return count;
    }
    void clear(char grid[][],int r,int c){
        if(r<0 || r>=grid.length || c<0 || c>=grid[0].length || grid[r][c]=='0'){
            return;
        }
        grid[r][c]='0';
        int dr[]={1,-1,0,0};
        int dc[]={0,0,1,-1,};
        for(int i=0;i<dr.length;i++){
            int row=r+dr[i];
            int col=c+dc[i];
            clear(grid,row,col);
        }
    }
}