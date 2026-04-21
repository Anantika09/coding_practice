class Solution {
    class UnionFind{
        int [] parent;
        public UnionFind(int n){
            parent=new int[n];
            for(int i=0;i<n;i++)parent[i]=i;
        }
        public int findUltParent(int x){
            if(parent[x]!=x){
                parent[x]=findUltParent(parent[x]);
            }
            return parent[x];
        }
        public void Union(int a,int b){
            parent[findUltParent(a)]=findUltParent(b);
        }
    }
    public int minimumHammingDistance(int[] source, int[] target, int[][] allowedSwaps) {
        int n=source.length;
        UnionFind uf=new UnionFind(n);
        for(int[] allowed:allowedSwaps){
            int from =allowed[0];
            int to=allowed[1];
            uf.Union(from,to);
        }
        HashMap<Integer,ArrayList<Integer>>group=new HashMap<>();
        for(int i=0;i<n;i++){
            int parent=uf.findUltParent(i);
            group.computeIfAbsent(parent,k->new ArrayList()).add(i);
        }
        int minDist=0;
        for(ArrayList<Integer> Values:group.values()){
            HashMap<Integer,Integer>freq = new HashMap<>();
            for(Integer it:Values){
                freq.put(source[it],freq.getOrDefault(source[it],0)+1);
            }
            for(Integer idx:Values){
                if(freq.getOrDefault(target[idx],0)>0){
                    freq.put(target[idx],freq.getOrDefault(target[idx],0)-1);
                }else{
                    minDist++;
                }
            }
        }
        return minDist;
    }
}