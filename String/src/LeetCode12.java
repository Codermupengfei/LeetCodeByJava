/**
 * Created by OovEver on 2017/7/10.
 */
public class LeetCode12 {
    public String intToRoman(int num) {
        int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] strs = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0;i<values.length;i++) {
            while (num >= values[i]) {
                num -= values[i];
                stringBuilder.append(strs[i]);
            }
        }
        return stringBuilder.toString();
    }
}
