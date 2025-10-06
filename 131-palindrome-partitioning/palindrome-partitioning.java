class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans=new ArrayList<>();
        f(0,s,new ArrayList<>(),ans);
        return ans;
    }
    void f(int i,String s,List<String> p,List<List<String>> ans){
        if(i==s.length()){
            ans.add(new ArrayList<>(p));
            return;
        }
        for(int j=i;j<s.length();j++){
            if(ok(s,i,j)){
                p.add(s.substring(i,j+1));
                f(j+1,s,p,ans);
                p.remove(p.size()-1);
            }
        }
    }
    boolean ok(String s,int l,int r){
        while(l<r){
            if(s.charAt(l++)!=s.charAt(r--)){
                return false;
            }
        }
        return true;
    }
}
