import java.util.ArrayList;
import java.util.List;

/**
 * Created by OovEver on 2017/4/9.
 */
public class Let442 {
    public List<Integer> findDuplicates(int[] nums) {

        List<Integer> list=new ArrayList<Integer>();
        if(nums==null||nums.length<1)
            return list;
        int[] nums1=new int[nums.length+1];
        for(int i=0;i<nums.length;i++){
            nums1[nums[i]]++;
        }
        for(int i=0;i<nums1.length;i++){
            if(nums1[i]>1){
                list.add(i);
            }
        }
        return list;
    }
}
