/**
 * Created by OovEver on 2017/11/1.
 * 用一个int，32位；而小写字母只有26个，后26位用来表示对应的字符是否存在。
 最后两个int相与，如果结果为0，说明两个对应的字符串没有相同的字符！
 */
public class LeetCode318 {
    public int maxProduct(String[] words) {

        if (words.length == 0 || words == null)
            return 0;
        int   len   = words.length;
        int[] value = new int[len];
        for (int i = 0; i < len; i++) {
            String temp = words[i];
            for (int j = 0; j < temp.length(); j++) {
                value[i] |= (1 << (temp.charAt(j) - 'a'));
            }
        }
        int maxProduct = 0;
        for (int i = 0; i < len; i++)
            for (int j = i + 1; j < len; j++) {
                if ((value[i] & value[j]) == 0 && (words[i].length() * words[j].length() > maxProduct)) {
                    maxProduct = words[i].length() * words[j].length();
                }
            }
        return maxProduct;
    }
    public static void main(String[] args) {
        System.out.println(1 << 'c' - 'a');
    }
}
