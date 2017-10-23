import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by OovEver on 2017/4/13.
 */
public class Let78 {
    void Back( List<List<Integer>> list,List<Integer>temp,int []nums,int start){
        list.add(new ArrayList<>(temp));
        for(int i=start;i<nums.length;i++){
            temp.add(nums[i]);
            Back(list,temp,nums,i+1);
            temp.remove(temp.size()-1);
        }
    }
    public List<List<Integer>> subsets(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list=new ArrayList<List<Integer>>();
        if(nums==null)
            return list;
        List<Integer>temp=new ArrayList<Integer>();
        Back(list,temp,nums,0);
        return list;
    }
}
