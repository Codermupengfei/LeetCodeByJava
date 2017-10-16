import java.util.HashMap;

/**
 * Created by OovEver on 2017/10/16.
 */
public class Tire_Tree {
    //    内部节点类
    private class Node {

        //        重复节点数目
        private int     dumpli_num;
        private Node[]  child;
        //    以该字符串为签注的字符串数，包括该字符串本身
        private int     prefix_num;
        //    是否单词节点
        private boolean isLeaf;

        public Node() {
            dumpli_num = 0;
            prefix_num = 0;
            child = new Node[26];
            isLeaf = false;
        }
    }

    private Node root;
    public Tire_Tree() {
        root = new Node();
    }

    public void insert(String words) {
        insert(this.root, words);
    }
    private void insert(Node root,String words){
        words = words.toLowerCase();
        char[] chrs = words.toCharArray();
        for(int i=0,length=chrs.length; i<length; i++){
            int index = chrs[i] - 'a';
            if (root.child[index] != null) {
                root.child[index].prefix_num++;
            } else {
                root.child[index] = new Node();
                root.child[index].prefix_num++;
            }
            if (i == length - 1) {
                root.child[index].isLeaf = true;
                root.child[index].dumpli_num++;
            }
            root = root.child[index];
        }
    }
    public HashMap<String,Integer> getAllWords(){
        return preTraversal(this.root, "");
    }
    private  HashMap<String,Integer> preTraversal(Node root,String prefixs){
        HashMap<String, Integer> map=new HashMap<String, Integer>();
        if (root != null) {
            if (root.isLeaf == true) {
                map.put(prefixs, root.dumpli_num);
            }
            for (int i = 0, length = root.child.length; i < length; i++) {

                if (root.child[i] != null) {
                    char ch = (char) (i + 'a');
                    ////递归调用前序遍历
                    String tempStr = prefixs + ch;
                    map.putAll(preTraversal(root.child[i], tempStr));
                }
            }
        }
        return map;
    }
    public HashMap<String, Integer> getWordsForPrefix(String prefix){
        return getWordsForPrefix(this.root, prefix);
    }
    private HashMap<String, Integer> getWordsForPrefix(Node root,String prefix){
        HashMap<String, Integer> map=new HashMap<String, Integer>();
        char[] chrs=prefix.toLowerCase().toCharArray();
        ////
        for(int i=0, length=chrs.length; i<length; i++){
            int index=chrs[i]-'a';
            if(root.child[index]==null){
                return null;
            }

            root=root.child[index];

        }
        ///结果包括该前缀本身
        ///此处利用之前的前序搜索方法进行搜索
        return preTraversal(root, prefix);
    }

    public static void main(String[] args) {
        Tire_Tree trie = new Tire_Tree();
        trie.insert("I");
        trie.insert("Love");
        trie.insert("China");
        trie.insert("China");
        trie.insert("China");
        trie.insert("China");
        trie.insert("China");
        trie.insert("xiaoliang");
        trie.insert("xiaoliang");
        trie.insert("man");
        trie.insert("handsome");
        trie.insert("love");
        trie.insert("chinaha");
        trie.insert("her");
        trie.insert("know");
        HashMap<String,Integer> map=trie.getAllWords();
        for(String key:map.keySet()){
            System.out.println(key+" 出现: "+ map.get(key)+"次");
        }
        map=trie.getWordsForPrefix("chin");

        System.out.println("\n\n包含chin（包括本身）前缀的单词及出现次数：");
        for(String key:map.keySet()){
            System.out.println(key+" 出现: "+ map.get(key)+"次");
        }



    }

}
