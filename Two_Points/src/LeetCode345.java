import java.util.ArrayList;
import java.util.List;

/**
 * Created by OovEver on 2017/6/11.
 */
public class LeetCode345 {
    /**
     * 思路：两个指针
     * 一个从前往后扫 一个从后往前扫 扫的过程判断是否为元音字符
     * 如果是的话就交换字符
     * */
    public String reverseVowels(String s) {
        List<Character> vowel = new ArrayList<Character>();
        vowel.add('a');
        vowel.add('e');
        vowel.add('i');
        vowel.add('o');
        vowel.add('u');
        vowel.add('A');
        vowel.add('E');
        vowel.add('I');
        vowel.add('O');
        vowel.add('U');
        int i=0;
        int j=s.length()-1;
        char[] sTochar = s.toCharArray();
        while (i < j) {
            while (i<j&&!vowel.contains(sTochar[i])) {
                i++;
            }
            while (i<j&&!vowel.contains(sTochar[j])) {
                j--;
            }
            if (i < j) {
                char temp;
                temp = sTochar[i];
                sTochar[i] = sTochar[j];
                sTochar[j] = temp;
                i++;
                j--;
            }

        }
        return new String(sTochar);
    }
}
