class Solution{
    public boolean predictTheWinner(int[] n){
        return f(n,0,n.length-1)>=0;
    }
    int f(int[] n,int i,int j){
        if(i==j)return n[i];
        int a=n[i]-f(n,i+1,j);
        int b=n[j]-f(n,i,j-1);
        return Math.max(a,b);
    }
}
