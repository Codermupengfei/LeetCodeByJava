import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by OovEver on 2017/5/15.
 */
public class Let438 {
    public static List<Integer> findAnagrams(String s, String p) {
        int pLength=p.length();
        int sLength=s.length();
        List<Integer> result=new ArrayList<Integer>();
        if(pLength>sLength)
            return result;
        if(pLength==0||sLength==0)
            return result;
        char[] pChar=new char[pLength];
        for(int i=0;i<pLength;i++){
            pChar[i]=p.charAt(i);
        }
        Arrays.sort(pChar);
        for(int i=0;i<sLength;i++){
            char[] sChar=new char[pLength];
            int scLen=0;
            boolean flag=true;
            for(int j=i;j<sLength&&j<i+pLength;j++){
                sChar[scLen++]=s.charAt(i);
            }
            Arrays.sort(sChar);
            for(int j=0;j<scLen&&j<pLength;j++){
                if(pChar[j]!=sChar[i])
                {
                    flag=false;
                    break;
                }

            }
            if(flag)
                result.add(i);

        }

        return result;
    }

    public static void main(String[] args) {
        String s="cbaebabacd";
        String p="abc";
        List<Integer> res=new ArrayList<>();
         res=findAnagrams(s,p);
        for(int i=0;i<res.size();i++)
            System.out.println(res.get(i));
    }

}
