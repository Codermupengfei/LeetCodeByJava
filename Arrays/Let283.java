/**
 * Created by OovEver on 2017/4/8.
 */
public class Let283 {
    public static void moveZeroes(int[] nums) {
        if(nums==null||nums.length<1)
            return;
        int j=0;
        int i=0;
        int temp;
        while (i<nums.length&&j<nums.length){
            while (i<nums.length&&nums[i]!=0){
                    i++;
            }
            j=i+1;
            while (j<nums.length&&nums[j]==0){
                j++;
            }
            if(i<nums.length&&j<nums.length&&nums[i]==0&&nums[j]!=0){
                temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
            }
        }

    }

    public static void main(String[] args) {
        int[] nums={1,0};
        moveZeroes(nums);

    }
}
