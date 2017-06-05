/**
 * Created by OovEver on 2017/4/8.
 */
public class Let88 {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
       int sumI=m+n-1;
        int i=m-1;
        int j=n-1;
        while (i>=0&&j>=0){
            if(nums1[i]>=nums2[j]){
                nums1[sumI--]=nums1[i--];
            }else {
                nums1[sumI--]=nums2[j--];
            }
        }
        if(i==-1){
            while (j>=0){
                nums1[j]=nums2[j];
                j--;
            }
        }
        System.out.println("sd");
        System.out.println(nums1.length);
        System.out.println(sumI);
    }

    public static void main(String[] args) {
        int[] nums1={2,3};
        int[] nums2={1};
        merge(nums1,2,nums2,1);
    }
}
