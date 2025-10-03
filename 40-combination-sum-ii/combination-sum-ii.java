class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(candidates); 
        helper(candidates,target,0,new ArrayList<>(),res);
        return res;
    }
    private void helper(int[] arr,int target,int start,List<Integer> List, List<List<Integer>> res){
        if(target==0){
            res.add(new ArrayList<>(List));
            return;
        }
        for(int i=start;i<arr.length;i++){
            if(i>start && arr[i]==arr[i-1]) continue;
            if(arr[i]>target) break;
            List.add(arr[i]);
            helper(arr,target-arr[i],i+1,List,res); 
            List.remove(List.size()-1); 
        }
    }
}