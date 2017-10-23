/**
 * Created by OovEver on 2017/4/8.
 */
public class Let189 {
    public static void rotate(int[] nums, int k) {
        if(nums==null){
            return;
        }else if(k==0||nums.length<=1) {
            return;
        }else {
            k=k%nums.length;
            if(k==0)
                return;
            int[] des=new int[k];
            System.arraycopy(nums,nums.length-k,des,0,k);
            System.arraycopy(nums,0,nums,k,nums.length-k);
            System.arraycopy(des,0,nums,0,k);
        }
    for(int i=0;i<nums.length;i++){
        System.out.println(nums[i]);
    }

    }

    public static void main(String[] args) {
        int []nums={1,2,3};
        rotate(nums,2);
    }
}
