class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
        List<Integer> list = new ArrayList<Integer>();
        int m=arr.length;
        int n=arr[0].length;
        int total=m*n;
        int min_r=0;
        int min_c=0;
        int max_r=m-1;
        int max_c=n-1;
        int count=0;
        while(count<total)
        {
            for(int i=min_c;i<=max_c && count<total;i++)
            {
                list.add(arr[min_r][i]);
                count++;
            }
            min_r++;
            for(int i=min_r;i<=max_r && count<total;i++)
            {
                list.add(arr[i][max_c]);
                count++;
            }
            max_c--;
            for(int i=max_c;i>=min_c && count<total;i--)
            {
                list.add(arr[max_r][i]);
                count++;
            }
            max_r--;
            for(int i=max_r;i>=min_r && count<total;i--)
            {
                list.add(arr[i][min_c]);
                count++;
            }
            min_c++;
        }
        return list;
    }
}