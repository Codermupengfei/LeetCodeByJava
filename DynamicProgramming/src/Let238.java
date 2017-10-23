/**
 * Created by OovEver on 2017/4/9.
 * 计算数左边数的成绩
 * 计算数组右边的成绩
 * 将两个乘积相乘
 */
public class Let238 {
    public static int[] productExceptSelf(int[] nums) {
       int[] res=new int[nums.length];
        res[0]=1;
        for(int i=1;i<nums.length;i++){
            res[i]=res[i-1]*nums[i-1];
        }
        int right=1;
        for(int i=nums.length-1;i>=0;i--){
            res[i]*=right;
            right*=nums[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums={1,2,3,4,};
        int[]nums1=productExceptSelf(nums);
        for(int i=0;i<nums.length;i++){
            System.out.println(nums1[i]);
        }
    }

}
