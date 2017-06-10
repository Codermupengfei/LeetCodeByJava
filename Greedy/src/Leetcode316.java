/**
 * Created by OovEver on 2017/6/10.
 */
public class Leetcode316 {
    /**
     * 思路：
     * 因为都是26位小写字母，所以用一个容量为26的count数组来维护
     * 判断每个字母出现的次数
     * 1.由于题目要求去重后的lexicographical顺序最小
     * 2.所以对字符串采用递归遍历每次找到最小的字符
     *
     * */
    public String removeDuplicateLetters(String s) {
        if (s == null || s.length() == 0) {
            return s;
        }
//      声明一个count数组用于记录每个字母出现的次数
        int[] count = new int[26];
        for(int i=0;i<s.length();i++) {
            count[s.charAt(i) - 'a']++;
        }
//       记录最小的位置
        int pos=0;
        for(int i=0;i<s.length();i++) {
//       如果当前的字符小于最小的字符则最小字符为当前的字符
            if (s.charAt(i)<s.charAt(pos)) {
                pos=i;
            }
            //遍历完的字符数减去1
            count[s.charAt(i)-'a']--;
//            如果当前的字符出现数为0则当前字符为最小字符
            if (count[s.charAt(i)-'a'] == 0) {
                break;
            }
        }
        String removeString = String.valueOf(s.charAt(pos));
        return removeString + removeDuplicateLetters(s.substring(pos + 1).replaceAll(removeString, ""));

    }
}
