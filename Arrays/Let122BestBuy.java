/**
 * Created by OovEver on 2017/4/8.
 */
public class Let122BestBuy {
    public int maxProfit(int[] prices) {
        int profile=0;
        if(prices.length<=1){
            return 0;
        }
        for(int i=1;i<prices.length;i++){
            if(prices[i]-prices[i-1]>0){
                profile+=prices[i]-prices[i-1];
            }
        }

        return profile;
    }
}
