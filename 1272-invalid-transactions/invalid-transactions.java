class Solution {
    public List<String> invalidTransactions(String[] t) {
        int n=t.length;
        String[] name=new String[n];
        String[] city=new String[n];
        int[] time=new int[n];
        int[] amt=new int[n];
        for(int i=0;i<n;i++){
            String[] s=t[i].split(",");
            name[i]=s[0];
            time[i]=Integer.parseInt(s[1]);
            amt[i]=Integer.parseInt(s[2]);
            city[i]=s[3];
        }
        boolean[] bad=new boolean[n];
        for(int i=0;i<n;i++){
            if(amt[i]>1000){
                bad[i]=true;
            }
            for(int j=0;j<n;j++){
                if(i==j){
                    continue;
                }
                if(name[i].equals(name[j]) && !city[i].equals(city[j]) && Math.abs(time[i]-time[j])<=60) {
                    bad[i]=true;
                    bad[j]=true;
                }
            }
        }
        List<String> res=new ArrayList<>();
        for(int i = 0;i<n;i++){
            if(bad[i]){
                res.add(t[i]);
            }
        }
        return res;
    }
}