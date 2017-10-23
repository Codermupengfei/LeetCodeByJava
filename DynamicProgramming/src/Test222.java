/**
 * Created by OovEver on 2017/5/25.
 */
import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Test222 {

    public static void main (String [] args) throws Exception {
//        Scanner in = new Scanner(System.in);
////        String line = in.nextLine();
        String line = "axbcba";
//        int cases = Integer.parseInt(scan.nextLine());

        String s = line;
        BigInteger dp[][] = new BigInteger[s.length()+1][s.length()+1];
        System.out.println(s);
        for(int i=0;i<s.length()+1;i++){
            Arrays.fill(dp[i], BigInteger.ZERO);
            dp[i][i] = BigInteger.ONE;
        }
        int num=0;
        Set<Character> set=new HashSet<Character>();
        for(int i=0;i<s.length();i++){
            if (!set.contains(s.charAt(i))) {
                set.add(s.charAt(i));
            }else {
                num++;
            }
        }
        for(int gap=1;gap<s.length();gap++){
            for(int i=1;i+gap<=s.length();i++){
                int j = gap+i;
                dp[i][j] = dp[i][j].add(BigInteger.ONE).add(dp[i][j-1]);
                for(int k=i;k<j;k++){
                    if(s.charAt(k-1)==s.charAt(j-1)){
                        dp[i][j] = dp[i][j].add(dp[k+1][j-1]).add(BigInteger.ONE);
                    }
                }
            }
        }
        BigInteger bigNum = new BigInteger("" + num);
        dp[1][s.length()]=dp[1][s.length()].subtract(bigNum);
        System.out.println(dp[1][s.length()]);

    }}