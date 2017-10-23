import java.util.ArrayList;
import java.util.List;

/**
 * Created by OovEver on 2017/4/9.
 */
public class Let120 {
    public static int minimumTotal(List<List<Integer>> triangle) {
        int length=triangle.size();
        if(length==0) return 0;
        if(length==1) return triangle.get(0).get(0);
        int minNum=0;
        for(int i=length-2;i>=0;i--) {
            List<Integer> list=triangle.get(i);
            for (int j = 0; j < triangle.get(i).size(); j++) {
                int sum1 = triangle.get(i).get(j) + Math.min(triangle.get(i + 1).get(j), triangle.get(i + 1).get(j + 1));
                list.set(j,sum1);
            }

        }
        return triangle.get(0).get(0);
    }

    public static void main(String[] args) {
        List<List<Integer>> trangle=new ArrayList<List<Integer>>();
        List<Integer> list=new ArrayList<>();
        list.add(1);
        trangle.add(list);
        List<Integer> list1=new ArrayList<>();
        list1.add(2);
        list1.add(3);
        trangle.add(list1);
        System.out.println(minimumTotal(trangle));


    }

}
