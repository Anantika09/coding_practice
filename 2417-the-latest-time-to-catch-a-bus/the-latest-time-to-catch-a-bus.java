import java.util.*;

class Solution {
    public int latestTimeCatchTheBus(int[] buses, int[] passengers, int capacity) {
        Arrays.sort(buses);
        Arrays.sort(passengers);
        Set<Integer> set=new HashSet<>();
        for(int p:passengers){
            set.add(p);
        }
        int i=0;
        int last=-1;
        int cnt=0;
        for(int b:buses){
            cnt=0;
            while(i<passengers.length && passengers[i]<=b && cnt<capacity){
                last=passengers[i];
                i++;
                cnt++;
            }
        }
        int ans;
        if(cnt<capacity){
            ans=buses[buses.length-1];
        }
        else{
            ans=last-1;
        }
        while(set.contains(ans)){
            ans--;
        }
        return ans;
    }
}
