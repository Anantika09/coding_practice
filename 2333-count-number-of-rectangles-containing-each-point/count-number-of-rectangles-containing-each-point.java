class Solution {
    public int[] countRectangles(int[][] rectangles, int[][] points) {
        ArrayList<Integer>[] a=new ArrayList[101];
        for(int i=0;i<=100;i++){
            a[i]=new ArrayList<>();
        }
        for(int i=0;i<rectangles.length;i++){
            int l=rectangles[i][0];
            int h=rectangles[i][1];
            a[h].add(l);
        }
        for(int i=0;i<=100;i++){
            Collections.sort(a[i]);
        }
        int[] r=new int[points.length];
        for(int i=0;i<points.length;i++){
            int x=points[i][0];
            int y=points[i][1];
            int c=0;
            for(int h=y;h<=100;h++){
                ArrayList<Integer> t=a[h];
                if(t.size()==0){
                    continue;
                }
                int l=0;
                int r1=t.size();
                while(l<r1){
                    int m=(l+r1)/2;
                    if(t.get(m)>=x){
                        r1=m;
                    }
                    else{
                        l=m+1;
                    }
                }
                c+=t.size()-l;
            }
            r[i]=c;
        }
        return r;
    }
}