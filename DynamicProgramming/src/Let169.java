import java.util.Arrays;

/**
 * Created by OovEver on 2017/4/8.
 */
public class Let169 {
    public static int majorityElement(int[] nums) {
        int majornum=0;
        int max=0;
        int length=1;
        Arrays.sort(nums);
        int i;
        for(i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                length++;
            }else {
                if(length>max){
                    max=length;
                    majornum=i-1;
                    if(max>nums.length/2)
                        return nums[majornum];
                }
                length=1;
            }
        }
        if(length>max){
            max=length;
            majornum=i-1;
            if(max>nums.length/2)
                return nums[majornum];
        }
        return nums[majornum];
    }

    public static void main(String[] args) {
        int[] nums={3,2,3};
        System.out.println(majorityElement(nums));
    }
}
