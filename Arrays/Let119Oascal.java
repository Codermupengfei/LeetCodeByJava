import java.util.ArrayList;
import java.util.List;

/**
 * Created by OovEver on 2017/4/4.
 */
public class Let119Oascal {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<>();
        if(rowIndex==0)
        {
            result.add(1);
            return result;
        }
        if (rowIndex==1){
            result.add(1);
            result.add(1);
            return result;
        }
        int temp=1;
        int addtemp;
        result.add(1);
        result.add(1);
        for(int i=2;i<=rowIndex;i++){
            for (int j=1;j<i;j++){
                addtemp=result.get(j)+temp;
                temp=result.get(j);
                result.set(j,addtemp);
            }
            result.add(1);
        }
        return result;
    }
}
