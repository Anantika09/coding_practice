class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> arr=new ArrayList<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            arr.add(nums[i]);
        }
        fun(arr,ans,new ArrayList<>());
        return ans;
    }
    public void fun(List<Integer> arr,List<List<Integer>> ans,List<Integer> p){
        if(arr.size()==0){
            ans.add(new ArrayList<>(p));
            return;
        }
        for(int i=0;i<arr.size();i++){
            int num=arr.get(i);
            p.add(num);
            arr.remove(i);
            fun(arr,ans,p);
            arr.add(i,num);
            p.remove(p.size()-1);
        }
    }
}