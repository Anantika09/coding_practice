class Solution {
    public int findMinArrowShots(int[][] points) {

        Arrays.sort(points, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]>lst=new ArrayList<>();
        int st=points[0][0];
        int ed=points[0][1];
        int n=points.length;
        for (int i=1;i<n;i++) {
           if(ed>= points[i][0]){
            ed=Math.min(ed , points[i][1]);
           }
           else{
            lst.add(new int[]{st,ed});
            st= points[i][0];
            ed= points[i][1];
           }
        }
        lst.add(new int[]{st,ed});

        return lst.size();
    }
}