/**
 * Created by OovEver on 2017/6/10.
 */
public class LeetCode135 {
    /**
     * 思路
     * 题目很简单
     * 1。首先左扫一遍，右边的rating是否比左边大，若果比左边大 则相对于左边的数加一
     * 2.接着右扫一遍，左边的rating是否比右边那的大，如果右边的比比昨天的大，咋相对于右边的数加一
     * */
    public int candy(int[] ratings) {
        int total = 0;
        if (ratings == null) {
            return total;
        }
        int len = ratings.length;
        int[] candy =new int[len];
        candy[0] = 1;
        for(int i=1;i<len;i++) {
            if (ratings[i] > ratings[i - 1]) {
                candy[i] = candy[i - 1]+1;
            }else {
                candy[i] = 1;
            }
        }
        total = candy[len - 1];
        for(int i=len-2;i>=0;i--) {
            if (ratings[i] > ratings[i + 1] && candy[i] <= candy[i + 1]) {
                candy[i] = candy[i + 1] + 1;
            }
            total += candy[i];
        }
        return total;
    }
}
