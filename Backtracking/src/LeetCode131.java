import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by OovEver on 2017/10/31.
 */
public class LeetCode131 {
    List<List<String>> resultLst;
    ArrayList<String>  currLst;
    public List<List<String>> partition(String s) {
        resultLst = new ArrayList<>();
        currLst = new ArrayList<>();
        backTrack(s, 0);
        return resultLst;
    }
    public void backTrack(String s, int l){
        if (currLst.size() > 0 && l >= s.length()) {
            List r = (ArrayList<String>)currLst.clone();
            resultLst.add(r);
        }
        for(int i=l;i<s.length();i++) {
            if (isPalindrome(s, l, i)) {
                if (l == i) {
                    currLst.add(Character.toString(s.charAt(i)));
                } else {
                    currLst.add(s.substring(l, i + 1));
                }
                backTrack(s, i + 1);
                currLst.remove(currLst.size() - 1);
            }
        }

    }
    public boolean isPalindrome(String str, int l, int r){
        if (l == r) {
            return true;
        }
        while (l < r) {
            if (str.charAt(l) != str.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "aab";
        LeetCode131 test = new LeetCode131();
        System.out.println(test.partition(s));
    }
}
