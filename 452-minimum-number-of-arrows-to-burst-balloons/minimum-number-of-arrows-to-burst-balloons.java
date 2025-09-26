class Solution {
    public int findMinArrowShots(int[][] points) {

        Arrays.sort(points, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]>list=new ArrayList<>();
        int first=points[0][0];
        int last=points[0][1];
        int n=points.length;
        for (int i=1;i<n;i++) {
           if(last>= points[i][0]){
            last=Math.min(last, points[i][1]);
           }
           else{
            list.add(new int[]{first,last});
            first= points[i][0];
            last= points[i][1];
           }
        }
        list.add(new int[]{first,last});

        return list.size();
    }
}