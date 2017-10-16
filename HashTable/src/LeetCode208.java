/**
 * Created by OovEver on 2017/10/16.
 */
public class LeetCode208 {
   static class TrieNode {
        public char val;
        public boolean isWord;
        public TrieNode[] children = new TrieNode[26];
        public TrieNode() {}
        TrieNode(char c){
            TrieNode node = new TrieNode();
            node.val = c;
        }
    }
   public static class Trie {
        private  TrieNode root;
        /**
         * Initialize your data structure here.
         */
        public Trie() {
            root = new TrieNode();
            root.val=' ';
        }

        /** Inserts a word into the trie. */
        public void insert(String word) {
            TrieNode temp = root;
            for (char c : word.toCharArray()) {
                if (temp.children[c - 'a'] != null) {
                    temp = temp.children[c - 'a'];
                } else {
                    temp.children[c - 'a'] = new TrieNode(c);
                }
            }
            temp.isWord = true;
        }

        /** Returns if the word is in the trie. */
        public boolean search(String word) {
            TrieNode temp = root;
            for (char c : word.toCharArray()) {
                if (temp.children[c - 'a'] == null) {
                    return false;
                } else {
                    temp = temp.children[c - 'a'];
                }
            }
            return temp.isWord;
        }

        /** Returns if there is any word in the trie that starts with the given prefix. */
        public boolean startsWith(String prefix) {
            TrieNode temp = root;
            for (char c : prefix.toCharArray()) {
                if (temp.children[c - 'a'] == null) {
                    return false;
                } else {
                    temp = temp.children[c - 'a'];
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Trie test = new Trie();
        test.search("aa");
    }
}
