import java.util.ArrayList;
import java.util.List;

/**
 * Created by OovEver on 2017/6/11.
 */
public class LeetCode125 {
    /**
     * 思路
     * 1.首先将string转化为小写字母
     * 2.首先将string转化为数组
     * 2.去除掉string的无用空格字符只保留字母与数字
     * */
    public static boolean isPalindrome(String s) {
        if (s == null||s.length()==0) {
            return true;
        }
        s=s.toLowerCase();
        char[] sToChar = s.toCharArray();
        List<Character> characterList = new ArrayList<Character>();
        for(int i=0;i<sToChar.length;i++) {
            if ((sToChar[i] >= '0' && sToChar[i] <= '9') || (sToChar[i] >= 'a' && sToChar[i] <= 'z')) {
                characterList.add(sToChar[i]);
            }
        }
        if(characterList.size()==0)
            return true;
        int i=0;
        int j = characterList.size()-1;
        while (characterList.get(i) == characterList.get(j)) {
            i++;
            j--;
            if (j <= i) {
                break;
            }
        }
        if (j<=i) {
            return true;
        }
        else
            return false;

    }

    public static void main(String[] args) {
        String s = "0P";
        System.out.println(isPalindrome(s));
    }
}
