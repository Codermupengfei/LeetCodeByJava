/**
 * Created by OovEver on 2017/11/1.
 * ѧϰ������ת��ʮ���Ƶķ�ʽ
 */
public class LeetCode693 {
    public static boolean hasAlternatingBits(int n) {
        int last=n%2,cur;
        n=n/2;
        while(n>0){
            cur=n%2;
            if(cur==last) return false;
            last=cur;
            n=n/2;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(hasAlternatingBits(10));
    }
}
