/**
 * Created by OovEver on 2017/10/23.
 */
public class LeetCode712 {
    public int minimumDeleteSum(String s1, String s2) {
        int sum=0;
        int [][]count=new int[s1.length()+1][s2.length()+1];
        for(int i=1;i<=s1.length();i++){
            count[i][0]=count[i-1][0]+s1.charAt(i-1);
        }
        for(int j=1;j<=s2.length();j++){
            count[0][j]=count[0][j-1]+s2.charAt(j-1);
        }
        for(int i=1;i<=s1.length();i++){
            for(int j=1;j<=s2.length();j++){
                int cost=(s1.charAt(i-1)==s2.charAt(j-1))?0:s1.charAt(i-1)+s2.charAt(j-1);
                count[i][j]=Math.min(count[i-1][j]+s1.charAt(i-1),count[i][j-1]+s2.charAt(j-1));
                count[i][j]=Math.min(count[i][j],count[i-1][j-1]+cost);
            }
        }
        return count[s1.length()][s2.length()];
    }
    public static void main(String[] args) {
        String s = "aa";

    }
}
