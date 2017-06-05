/**
 * Created by OovEver on 2017/4/17.
 */
public class Let31 {
    public static void nextPermutation(int[] nums) {
        if(nums==null||nums.length<1)
            return;
        if(nums.length==2){
            reverst(nums,0,nums.length-1);
            return;
        }
        int i=nums.length-1;
        while (i>0&&nums[i-1]>=nums[i]){
            i--;
        }
        i--;
        if(i==-1){
        // 翻转
            reverst(nums,0,nums.length-1);
            return;
        }
        int j=i+1;
        while (j<nums.length&&nums[j]>nums[i]){
            j++;
        }
        j--;
        int temp;
        temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
        reverst(nums,i+1,nums.length-1);
        return;
    }
    static  int[] reverst(int []nums,int start,int end){
        int temp=nums[start];
        while (start<end){
            temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            end--;
            start++;
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums={5,1,1};
        nextPermutation(nums);
    }
}
