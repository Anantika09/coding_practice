class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points,(a,b)->Integer.compare(a[1],b[1]));
        int Pos=points[0][1];
        int Count=1;
        for(int i=1;i<points.length;i++){
            if(Pos>=points[i][0]){
                continue;
            }
            Count++;
            Pos=points[i][1];
        }
        return Count;
    }
}