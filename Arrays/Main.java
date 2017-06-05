import java.util.*;

/**
 * Created by OovEver on 2017/5/25.
 */
public class Main {
     static  int aaaa=0;

    public static void noSequenceCompose(List<String> candidate, String prefix, int index,long sum) {
        if(isPalindrome(prefix)){
            aaaa++;
        }
//        System.out.println(prefix);

        for(int i=index;i<candidate.size();i++) {
            List<String> tmp = new ArrayList<String>(candidate);
            noSequenceCompose(tmp, prefix + tmp.remove(i),i,sum);
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line=in.nextLine();
        System.out.println(solve(line));

    }
    public static boolean isPalindrome(String s){
        int low=0;
        int high=s.length()-1;
        while(low<high){
            if(s.charAt(low)!=s.charAt(high))
                return false;
            low++;
            high--;
        }
        return true;
    }
    public static long solve(String s){
        int len=s.length();
        String[] sArr = new String[len];
        char[] temp=new char[1];
        int num=0;
        Set<Character> set=new HashSet<Character>();
        for(int i=0;i<s.length();i++){
            if (!set.contains(s.charAt(i))) {
                set.add(s.charAt(i));
            }else {
                num++;
            }
        }
        for(int i=0;i<len;i++) {
            temp[0] = s.charAt(i);
            sArr[i] = new String(temp);
        }
        long sum=0;
        List<String> strList = Arrays.asList(sArr);
        noSequenceCompose(strList,"",0,0);
        System.out.println(aaaa);
        sum=aaaa-num;
        return sum;

    }
}
