import java.util.Arrays;

/**
 * Created by OovEver on 2017/4/3.
 */
public class LeetCode35SearchIP {
//    二分查找
public static int binarySearch(int[] nums,int target){
    int low=0;
    int high=nums.length-1;
    while (low<=high){
        int middle=(low+high)/2;
        if(nums[middle]==target)
            return middle;
        else if(nums[middle]<target)
            low=middle+1;
        else high=middle-1;
    }
    return -1;
}
    public static int searchInsert(int[] nums, int target) {
        int[] nums2=new int[nums.length+1];

        int index=binarySearch(nums,target);
        if(index==-1){
            nums2[0]=target;
            System.arraycopy(nums,0,nums2,1,nums.length);
            Arrays.sort(nums2);
            index=binarySearch(nums2,target);
        }
        return index;
    }

    public static void main(String[] args) {
        int[] nums={1,3};
        int index=searchInsert(nums,0);
        System.out.println(index);
    }
}
