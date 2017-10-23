import java.util.ArrayList;
import java.util.List;

/**
 * Created by OovEver on 2017/4/8.
 */
public class Let448 {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list=new ArrayList<Integer>();
        int[] nums1=new int[nums.length+1];
        for(int i=1;i<=nums.length;i++){
            nums1[nums[i-1]]++;
        }
        for(int i=1;i<=nums.length;i++){
            if(nums1[i]==0)
                list.add(i);
        }
        return list;
    }

    public static void main(String[] args) {
        int[] nums={1,1};
        findDisappearedNumbers(nums);
    }
}
