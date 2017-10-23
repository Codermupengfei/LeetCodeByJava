/**
 * Created by OovEver on 2017/4/3.
 */
public class Let1TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int []result=new int[2];
        for (int i=0;i<nums.length;i++)
            for (int j=0;j!=i&&j<nums.length;j++)
            {
                if(nums[i]+nums[j]==target){
                    if(i<j){
                        result[0]=i;
                        result[1]=j;
                    }
                   else {
                        result[0]=j;
                        result[1]=i;
                    }

                    return result;

                }
            }
        return result;
    }
    public static void main(String[] args) {

        int[] nums = {2, 7, 11, 15};
        int[] result=twoSum(nums,9);
        for (int i=0;i<result.length;i++){
            System.out.println(result[i]);
        }
    }
}
