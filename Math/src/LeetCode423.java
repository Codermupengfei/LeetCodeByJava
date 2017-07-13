import com.sun.org.apache.regexp.internal.RE;

/**
 * Created by OovEver on 2017/7/13.
 * 对字符串中的字符进行计数，根据这些字符与数字的关系可以直接得到结果。

 例如：字符z只在zero中出现，字符w只在two中出现，字符x只在six中出现，字符g只在eigth中出现，字符u只在four中出现

 那么我们根据z,w,x,g,u的个数就可以知道0,2,6,8,4的个数。

 对于剩下的one,three,five,seven，one可以由字符o的个数减去在0,2,4,6,8中出现的o的个数。

 three可以由字符h的个数减去字符t,r,e在0,2,4,6,8中出现的个数

 同理可以得到剩下的数字的个数
 */
public class LeetCode423 {
    public String originalDigits(String s) {
        int[] count = new int[10];
        for(int i=0;i<s.length();i++) {
            char c = s.charAt(i);
            if (c == 'z') count[0]++;
            if (c == 'w') count[2]++;
            if (c == 'x') count[6]++;
            if (c == 's') count[7]++; //7-6
            if (c == 'g') count[8]++;
            if (c == 'u') count[4]++;
            if (c == 'f') count[5]++; //5-4
            if (c == 'h') count[3]++; //3-8
            if (c == 'i') count[9]++; //9-8-5-6
            if (c == 'o') count[1]++; //1-0-2-4
        }
        count[7] -= count[6];
        count[5] -= count[4];
        count[3] -= count[8];
        count[9] = count[9] - count[8] - count[5] - count[6];
        count[1] = count[1] - count[0] - count[2] - count[4];
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0;i<=9;i++) {
            for(int j=0;j<count[i];j++) {
                stringBuilder.append(i);
            }
        }
        return stringBuilder.toString();
    }

}
