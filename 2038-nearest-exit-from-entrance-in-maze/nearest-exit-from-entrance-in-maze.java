class Solution{
    public int nearestExit(char[][] maze,int[] entrance){
        Queue<int[]>q=new LinkedList<>();
        q.add(entrance);
        int l=0;
        int d[][]={{-1,0},{0,-1},{0,1},{1,0}};
        maze[entrance[0]][entrance[1]]='+';
        while(!q.isEmpty()){
            int size=q.size();
            l++;
            while(size-->0){
                int f[]=q.poll();
                for(int dir[]:d){
                    int r=f[0]+dir[0];
                    int c=f[1]+dir[1]; 
                    if(r<0||r>=maze.length||c<0||c>=maze[0].length||maze[r][c]=='+'){
                        continue;
                    }

                    if(r==0||c==0||r==maze.length-1||c==maze[0].length-1){
                        return l;
                    } 
                    q.add(new int[]{r,c});
                    maze[r][c]='+';
                }
            }
        }
        return -1;
    }
}