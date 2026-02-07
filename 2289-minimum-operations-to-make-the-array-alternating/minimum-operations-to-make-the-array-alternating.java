class Solution {
    public int minimumOperations(int[] nums) {
        int n=nums.length;
        if(n==1){
            return 0;
        }
        int[] even=new int[100001];
        int[] odd=new int[100001];
        for(int i=0;i<n;i++){
            if(i%2==0){
                even[nums[i]]++;
            }
            else{
                odd[nums[i]]++;
            }
        }
        int e1=0,e2=0,o1=0,o2=0;
        for(int i=1;i<=100000;i++){
            if(even[i]>even[e1]){
                e2=e1;
                e1=i;
            }
            else if(even[i]>even[e2]){
                e2=i;
            }

            if(odd[i]>odd[o1]){
                o2=o1;
                o1=i;
            }
            else if(odd[i]>odd[o2]){
                o2=i;
            }
        }

        if(e1!=o1){
            return n-even[e1]-odd[o1];
        }
        return Math.min(
            n-even[e1]-odd[o2],
            n-even[e2]-odd[o1]
        );
    }
}
