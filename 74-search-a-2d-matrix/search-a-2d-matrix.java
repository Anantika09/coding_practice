class Solution {
    public boolean searchMatrix(int[][] arr, int target) {
        int m=arr.length;
        int n=arr[0].length;
        int row=0;
        int col=n-1;
        while(row<m && col>=0)
        {
            int ele=arr[row][col];
            if(ele==target){
                return true;
            }
            if(ele<target){
                row++;
            }
            else{
                col--;
            }
        }
        return false;
        
    }
}