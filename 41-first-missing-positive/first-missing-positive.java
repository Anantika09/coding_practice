class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        int ans=1;
        while(true){
            if(!set.contains(ans)){
                return ans; 
            }
            ans++;
        }
    }
}