/**
 * Created by OovEver on 2017/7/12.
 * 思路
 * 找到数学规律
 * [Step 1]:

 438  == 40*10 +3*10 +8 ;

 4+3+8 == 4*(10%9)*(10%9)+3*(10%9)+8%9= 15   ;
 [Step 2]:

 15  == 1*10 + 5 ;

 1+5 == 1*(10%9)+5%9= 6 ;
 [So we can see]:

 ab%9%9%9==ab%9;

 just return num%9; and don't forget num==0 or num==9
 */
public class LeetCode258 {
    public int addDigits(int num) {
        if (num == 0) {
            return 0;
        }
        if (num %9==0) {
            return 9;
        }
        return num % 9;
    }
}
