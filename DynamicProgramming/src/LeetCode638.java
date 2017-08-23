import java.util.List;

/**
 * Created by OovEver on 2017/7/15.
 * 思路
 * 1.按照优惠遍历
 * 看是否满足遍历要求
 * 满足遍历要求的话 求出一个结果
 * 并减去优惠所需的数量
 * 之后递归求解
 * 2.如果不满足要求
 * 则将之前减去的结果加上去
 * 3.计算剩余的钱
 */
public class LeetCode638 {
    public int shoppingOffers(List<Integer> price, List<List<Integer>> special, List<Integer> needs) {
        int result = Integer.MAX_VALUE;
        for(int i=0;i<special.size();i++) {
            List<Integer> offer = special.get(i);
            boolean isVaild = false;
            for(int j=0;j<needs.size();j++) {
                int remain = needs.get(j) - offer.get(j);
                needs.set(j, remain);
                if (!isVaild && remain < 0) {
                    isVaild = true;
                }

            }
            if (!isVaild) {
                result = Math.min(result, shoppingOffers(price, special, needs) + offer.get(needs.size()));
            }
            for(int k=0;k<needs.size();k++) {
                int remain = needs.get(k) + offer.get(k);
                needs.set(k, remain);
            }
        }
        int nooffer = 0;
        for(int i=0;i<needs.size();i++) {
            nooffer += needs.get(i) * price.get(i);
        }
        result = Math.min(nooffer, result);
        return result;
    }
}
