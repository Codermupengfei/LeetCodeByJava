import java.util.ArrayList;
import java.util.List;

/**
 * Created by OovEver on 2017/4/9.
 */
public class Let118 {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> allrows=new ArrayList<List<Integer>>();
        if(numRows<0)
            return allrows;
        else {

            for(int i=0;i<numRows;i++){
                List<Integer> rows=new ArrayList<Integer>();
                for(int j=0;j<=i;j++){
                    if(j==0||j==i)
                        rows.add(1);
                    else
                        rows.add(allrows.get(i-1).get(j-1)+allrows.get(i-1).get(j));

                }
                allrows.add(rows);
            }

        }
        return allrows;

    }

    public static void main(String[] args) {
        List<List<Integer>> list=generate(2);
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }

}
