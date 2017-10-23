import java.util.Arrays;

/**
 * Created by OovEver on 2017/4/9.
 */
public class Let532 {
    public static int findPairs(int[] nums, int k) {
        int pairsNum=0;
        if(nums.length<1||nums==null)
            return 0;
        Arrays.sort(nums);
        int itemp=0;
        if(k==0){
            for(int i=1;i<nums.length;i++){
                itemp=i;
                while (i<nums.length&&nums[i]==nums[i-1]){
                   i++;
                }
                if(itemp!=i){
                    pairsNum++;
                }
            }
            return pairsNum;
        }
        for(int i=0;i<nums.length;i++){
            itemp=i;
            for(int j=i+1;j<nums.length;j++){
                while(j<nums.length&&nums[i]==nums[j]){
                    j++;
                    itemp=j;
                }
                if(j<nums.length&&nums[j]!=nums[i]){
                    if(nums[j]-nums[i]==k){
                        pairsNum++;
                        if(itemp!=i)
                        i=itemp-1;
                        break;
                    }
                }
            }
        }
        return pairsNum;
    }

    public static void main(String[] args) {
        int[] nums={1,1,1,2,2};
        System.out.println(findPairs(nums,1));
    }
}
