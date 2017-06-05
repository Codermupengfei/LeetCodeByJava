/**
 * Created by OovEver on 2017/4/8.
 */
public class Let414 {
    public static int thirdMax(int[] nums) {
        if(nums==null)
            return 0;
        else if(nums.length==1)
            return nums[0];
        int fir=Integer.MIN_VALUE;
        Integer sec=null;
        Integer thr=null;
        for(int i=0;i<nums.length;i++){
          fir=fir<nums[i]?nums[i]:fir;
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]<fir&&sec==null){
                sec=nums[i];
            }
            if(nums[i]<fir&&sec<nums[i]){
                sec=nums[i];
            }

        }
        if(sec==null)
            return fir;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<sec&&thr==null){
                thr=nums[i];
            }
            if(nums[i]<sec&&thr<nums[i]){
                thr=nums[i];            }

        }
        if(thr==null)
            return fir;

        return thr;
    }

    public static void main(String[] args) {
        int[] nums={1,2,-2147483648};
        thirdMax(nums);
        System.out.println(thirdMax(nums));

    }
}
