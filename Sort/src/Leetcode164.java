/**
 * Created by OovEver on 2017/6/11.
 */
public class Leetcode164 {
    /**
     * 思路
     * 1.数学规律
     * 最大数与最小数之间的差不会超过len=（max-min）/(N-1)
     * 所以桶的大小为len
     * 桶的数量为（max-min）/len+1
     * */
    public static int maximumGap(int[] nums) {
        if (nums.length < 2) {
            return 0;
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int val : nums) {
            max = Math.max(max, val);
            min = Math.min(min, val);
        }
        double len =Math.ceil (max - min) * 1.0 / (nums.length - 1);
        if(len==0) return 0;//所有元素一样大
        int cnt =(int)Math.floor((max - min) / len + 1);
        int[]minV=new int[cnt];
        int[] maxV=new int[cnt];
        for(int i=0;i<cnt;i++) {
            minV[i] = Integer.MAX_VALUE;
            maxV[i] = Integer.MIN_VALUE;
        }
        for(int i=0;i<nums.length;i++) {
            int id = (int)Math.floor((nums[i] - min) / len);
            minV[id] = Math.min(minV[id], nums[i]);
            maxV[id] = Math.max(maxV[id], nums[i]);
        }
        int res = 0, premax = maxV[0];//第一个桶包含最小值，因此一定不为空
        for(int i=1;i<cnt;i++) {
            if(minV[i]!=Integer.MAX_VALUE){
                res = Math.max(res, minV[i] - premax);
                premax = maxV[i];
            }

        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 6};
        maximumGap(nums);
    }
}
