class Solution{
    public List<List<String>> groupAnagrams(String[] s){
        Map<String,List<String>> m=new HashMap<>();
        for(String x:s){
            char[] c=x.toCharArray();
            Arrays.sort(c);
            String k=new String(c);
            m.putIfAbsent(k,new ArrayList<>());
            m.get(k).add(x);
        }
        return new ArrayList<>(m.values());
    }
}
