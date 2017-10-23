/**
 * Created by OovEver on 2017/4/3.
 */
public class LeetCode27RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int length=nums.length;
        int p_last=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                length--;
            }else {
                nums[p_last]=nums[i];
                p_last++;
            }
        }
        return length;
    }

    public static void main(String[] args) {
        int []nums={18,3,14,28,7,2,22,26,21};
        removeElement(nums,36);
    }
}
