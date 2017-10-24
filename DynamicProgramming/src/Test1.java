import sun.security.provider.X509Factory;

/**
 * Created by OovEver on 2017/9/17.
 */
public class test1 {
    static  void fun1(){
        int m = 0;
        char []num=new char[4];
        System.out.println(num.length);
        char [] s = "bbbbbbbbbbbbbbbbbbbbbbbb".toCharArray();
        System.arraycopy(num, 0, s, 0, s.length);
        num = s.clone();
        System.out.println(num.length);


    }
    public static void main(String[] args) {
        fun1();

    }
}
