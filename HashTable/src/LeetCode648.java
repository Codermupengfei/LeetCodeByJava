import java.util.List;

/**
 * Created by OovEver on 2017/10/11.
 */
public class LeetCode648 {
    public String replaceWords(List<String> dict, String sentence) {
        String[] tokens = sentence.split(" ");
        TireNode trie = buildTrie(dict);
        return replaceWords(tokens, trie);
    }
    private String replaceWords(String[] tokens, TireNode root) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String token : tokens) {
            stringBuilder.append(getShortestReplacement(token, root));
            stringBuilder.append(" ");
        }
        return stringBuilder.substring(0, stringBuilder.length()-1);
    }
    class TireNode {
        char val;
        TireNode[] children;
        boolean isWord;

        public TireNode(char val) {
            this.val = val;
            this.children = new TireNode[26];
            this.isWord = false;
        }
    }

    private TireNode buildTrie(List<String> dict) {
        TireNode root = new TireNode(' ');
        for (String word : dict) {
            TireNode temp = root;
            for (char c : word.toCharArray()) {
                if (temp.children[c - 'a'] == null) {
                    temp.children[c - 'a'] = new TireNode(c);
                }
                temp = temp.children[c - 'a'];
            }
            temp.isWord = true;
        }
        return root;
    }

    private String getShortestReplacement(String token, final TireNode root) {
        TireNode temp = root;
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : token.toCharArray()) {
            stringBuilder.append(c);
            if (temp.children[c - 'a'] != null) {
                if (temp.children[c - 'a'].isWord) {
                    return stringBuilder.toString();
                }
                temp = temp.children[c - 'a'];
            } else {
                return token;
            }
        }
        return token;
    }

}
