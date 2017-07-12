import java.util.ArrayList;
import java.util.List;

/**
 * Created by OovEver on 2017/7/11.
 * 思路
 * 统计每个单词在每行出现的次数
 * 如果在任一行出现的次数与单词长度相等，则该单词所有字母在一行
 */
public class LeetCode500 {
    public static String[] findWords(String[] words) {
        List<String> list = new ArrayList<>();
        String row1 = "qwertyuiopQWERTYUIOP";
        String row2 = "asdfghjklASDFGHJKL";
        String row3 = "zxcvbnmZXCVBNM";
        for (String word : words) {
            int count1 = 0;
            int count2 = 0;
            int count3 = 0;
            for(int i=0;i<word.length();i++) {
                if (count1 != 0 && count2 != 0 && count3 == 0 || count1 == 0 && count2 != 0 && count3 != 0 || count1 != 0 && count2 == 0 && count3 != 0 || count1 != 0 && count2 != 0 && count3 != 0) {
                    break;
                }
                if (row1.contains(word.charAt(i)+"")) {
                    count1++;
                } else if (row2.contains(word.charAt(i) + "")) {
                    count2++;
                } else if (row3.contains(word.charAt(i) + "")) {
                    count3++;
                } else {
                    break;
                }
            }
            if (count1 == word.length()||count2==word.length()||count3==word.length()) {
                list.add(word);
            }

        }
        return list.toArray(new String[list.size()]);
    }

    public static void main(String[] args) {
        String[] word = {"Hello", "Alaska", "Dad", "Peace"};
        findWords(word);
    }

}
