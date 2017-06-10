/**
 * Created by OovEver on 2017/6/8.
 */
public class Let321 {
    public static int[] maxNumber(int[] nums1, int[] nums2, int k) {
        int []maxNumber=new int[k];
        if(nums1.length==0||nums2.length==0||k==0)
        return maxNumber;
        int j=0;
        int mL=0;
        int i=0;
       while (true)
        {
            if (i<nums1.length&&j < nums2.length &&mL<k&& nums1[i] >= nums2[j]) {
                maxNumber[mL++] = nums1[i++];
            }else if(i<nums1.length&&j < nums2.length&&mL<k && nums1[i] < nums2[j]){
                maxNumber[mL++] = nums1[j++];
            }else if(i>=nums1.length||j>nums2.length||mL>=k){
                break;
            }

        }
        if (mL < k) {
            if(i<nums1.length){
                for(int m=i;m<nums1.length&&mL<k;m++) {
                    maxNumber[mL++] = nums1[m];
                }
            } else if (j < nums2.length) {
                for(int m=j;m<nums2.length&&mL<k;m++) {
                    maxNumber[mL++] = nums1[m];
                }
            }
        }
        return maxNumber;
    }

    public static void main(String[] args) {
        int[] nums1 = {3, 4, 6, 5};
        int[] nums2 = {9, 1, 2, 5, 8, 3};
        int k = 5;
        int[] res = maxNumber(nums1, nums2, k);
        for(int i=0;i<res.length;i++) {
            System.out.println(res[i]);
        }
    }
}
