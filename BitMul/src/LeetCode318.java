/**
 * Created by OovEver on 2017/11/1.
 * ��һ��int��32λ����Сд��ĸֻ��26������26λ������ʾ��Ӧ���ַ��Ƿ���ڡ�
 �������int���룬������Ϊ0��˵��������Ӧ���ַ���û����ͬ���ַ���
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
