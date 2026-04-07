class Trie {

    Node root;

    public Trie() {
        root=new Node('*');
    }
    
    public void insert(String word) {
        Node curr=root;
        for(char ch:word.toCharArray()){
            if(curr.children[ch-'a']==null){
                Node nn=new Node(ch);
                curr.children[ch-'a']=nn;
            }
            curr=curr.children[ch-'a'];
        }
        curr.isWord=true;
    }
    
    public boolean search(String word) {
        Node curr=root;
        for(char ch:word.toCharArray()){ 
            if(curr.children[ch-'a']==null){
                return false;             
            }
            curr=curr.children[ch-'a'];
        }
        return curr.isWord;

    }
    
    public boolean startsWith(String prefix) {
        Node curr=root;
        for(char ch:prefix.toCharArray()){
            if(curr.children[ch-'a']==null){
                return false;
            }
            curr=curr.children[ch-'a'];
        }
        return true;
    }

    class Node {
        char ch;
        boolean isWord;
        Node children [];

        public Node(char ch) {
            this.ch=ch;
            children=new Node[26];
        }

    }
}