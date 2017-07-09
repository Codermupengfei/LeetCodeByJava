/**
 * Created by OovEver on 2017/7/9.
 */
public class LeetCode520 {
    public static boolean detectCapitalUse(String word) {
        if (word.length() == 0) {
            return false;
        }
        if (word.charAt(0) >= 'A' && word.charAt(0) <= 'Z') {
            if (word.length() > 1 && (word.charAt(1) >= 'A' && word.charAt(1) <= 'Z')) {
                for (int i = 2; i < word.length(); i++) {
                    if (!(word.charAt(i) >= 'A' && word.charAt(i) <= 'Z')) {
                        return false;
                    }
                }
            }else  if (word.length() > 1 && (word.charAt(1) >= 'a' && word.charAt(1) <= 'z')) {
                for (int i = 2; i < word.length(); i++) {
                    if (word.charAt(i) >= 'A' && word.charAt(i) <= 'Z') {
                        return false;
                    }
                }
            }

        } else  if (word.charAt(0) >= 'a' && word.charAt(0) <= 'z') {
            for (int i = 1; i < word.length(); i++) {
                if (!(word.charAt(i) >= 'a' && word.charAt(i) <= 'z')) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "FlaG";
        System.out.println(detectCapitalUse(s));
    }
}
