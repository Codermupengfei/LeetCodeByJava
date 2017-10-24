import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.*;

/**
 */
public class Main {
    public static BigDecimal factorial(BigDecimal n){
        BigDecimal bd1 = new BigDecimal(1);//BigDecimal类型的1
        BigDecimal bd2 = new BigDecimal(2);//BigDecimal类型的2
        BigDecimal result = bd1;//结果集，初值取1
        while(n.compareTo(bd1) > 0){//参数大于1，进入循环
            result = result.multiply(n.multiply(n.subtract(bd1)));//实现result*（n*（n-1））
            n = n.subtract(bd2);//n-2后继续
        }
        return result;
    }
    public static void main(String[] arguments){
        Scanner sc = new Scanner(System.in);
        BigDecimal n = sc.nextBigDecimal();
        sc.close();
        System.out.print(factorial(n));
    }
}