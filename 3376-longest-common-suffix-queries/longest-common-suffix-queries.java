class Solution {
    static class TrieNode {
        int wordLen, wordIdx;
        TrieNode children[];
        TrieNode() {
            children = new TrieNode[26];
            wordLen = Integer.MAX_VALUE;
            wordIdx = Integer.MAX_VALUE;
        }
    }
    static class Trie {
        TrieNode root;
        Trie() {
            root = new TrieNode();
        }

        void update(TrieNode node, int len, int index) {
            if((node.wordLen > len) || (node.wordLen == len && node.wordIdx > index)) {
                node.wordLen = len;
                node.wordIdx = index;
            }
            return;
        }

        void insert(String word, int wordIdx) {
            int n = word.length();
            TrieNode curr = this.root;
            update(curr, n, wordIdx);
            for(int i=n-1; i>=0; --i) {
                int idx = word.charAt(i) - 'a';
                if(curr.children[idx] == null) {
                    curr.children[idx] = new TrieNode();
                }
                curr = curr.children[idx];
                update(curr, n, wordIdx);
            }
            return;
        }

        int query(String word) {
            int n = word.length();
            TrieNode curr = this.root;
            for(int i=n-1; i>=0; --i) {
                int idx = word.charAt(i) - 'a';
                if(curr.children[idx] == null) {
                    break;
                }
                curr = curr.children[idx];
            }
            return curr.wordIdx;
        }
    }
    public int[] stringIndices(String[] wordsContainer, String[] wordsQuery) {
        int n = wordsContainer.length;
        Trie tree = new Trie();
        for(int i=0; i<n; ++i) {
            String word = wordsContainer[i];
            tree.insert(word, i);
        }

        int m = wordsQuery.length;
        int res[] = new int[m];
        for(int i=0; i<m; ++i) {
            String word = wordsQuery[i];
            res[i] = tree.query(word);
        }

        return res;
    }
}