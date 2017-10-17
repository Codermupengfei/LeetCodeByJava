/**
 * Created by OovEver on 2017/10/17.
 */
public class LeetCode676 {
    class MagicDictionary {
        class TrieNode{
            TrieNode []children=new TrieNode[26];
            boolean isWord=false;
            public TrieNode(){}
        }
        TrieNode root;
        /** Initialize your data structure here. */
        public MagicDictionary() {
            root=new TrieNode();
        }

        /** Build a dictionary through a list of words */
        public void buildDict(String[] dict) {
            for(String s:dict){
                TrieNode Node =root;
                for(char c:s.toCharArray()){
                    if(Node.children[c-'a']==null){
                        Node.children[c-'a']=new TrieNode();
                    }
                    Node=Node.children[c-'a'];
                }
                Node.isWord=true;
            }
        }

        /** Returns if there is any word in the trie that equals to the given word after modifying exactly one character */
        public boolean search(String word) {
            char []arr=word.toCharArray();
            for(int i=0;i<arr.length;i++){
                for(char c='a';c<='z';c++){
                    if(arr[i]==c){
                        continue;
                    }
                    char temp=arr[i];
                    arr[i]=c;
                    if(helper(new String(arr),root)){
                        return true;
                    }
                    arr[i]=temp;

                }
            }
            return false;
        }
        private boolean helper(String s,TrieNode root){
            TrieNode node=root;
            for(char c:s.toCharArray()){
                if(node.children[c-'a']==null){
                    return false;
                }
                node =node.children[c-'a'];
            }
            return node.isWord;
        }
    }
}
