/**
 * Created by OovEver on 2017/7/12.
 * 思路
 * 依次取出s中的元素
 * result*26加上元素的位置
 */
public class LeetCode171 {
    public int titleToNumber(String s) {
        int result = 0;
        for(int i=0;i<s.length();i++) {
            result = result * 26 + (s.charAt(i) - 'A' + 1);
        }
        return result;
    }
}
