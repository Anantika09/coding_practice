class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int i=0;
        int j=people.length-1;
        int count=0;
        while(i<=j){
            int sum=people[i]+people[j];
            if(sum<=limit){
                count++;
                people[i]=-1;
                people[j]=-1;
                i++;
                j--;
            }
            else{
                j--;
            }
        }
        for(int k=0;k<people.length;k++){
            if(people[k]!=-1){
                count++;
            }
        }
        return count;
    }
}