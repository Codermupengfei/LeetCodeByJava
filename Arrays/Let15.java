import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by OovEver on 2017/4/11.
 */
public class Let15 {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list=new ArrayList<List<Integer>>();
        if(nums.length<3)
            return list;
        Arrays.sort(nums);
        int i=0;
      while (i<nums.length-2){

            if(nums[i]>0)
                return list;
          int j=i+1;
          int k=nums.length-1;
          while (j<k){
              int sum=nums[i]+nums[j]+nums[k];
              if(sum==0){
                  list.add(Arrays.asList(nums[i],nums[j],nums[k]));
              } if(sum<=0){
                  while (j<k&&nums[j]==nums[++j]);
              } if(sum>=0){
                  while (j<k&&nums[k]==nums[--k]);

              }
          }
          while (i<nums.length-2&&nums[i]==nums[++i]);

        }
        return list;
    }

    public static void main(String[] args) {
        int [] nums={-1,0,1,2,-1,-4};
        threeSum(nums);

    }
}
