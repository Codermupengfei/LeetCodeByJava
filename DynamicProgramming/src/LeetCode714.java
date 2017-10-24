/**
 * Created by OovEver on 2017/10/23.
 */
public class LeetCode714 {
    public static int maxProfit(int[] prices, int fee) {
        if(prices.length<1) return 0;
        int[] buy = new int[prices.length];
        int[] hold = new int[prices.length];
        int[] skip = new int[prices.length];
        int[] sell = new int[prices.length];
        buy[0]=-prices[0];
        hold[0]=-prices[0];
        for(int i=1;i<prices.length;i++){
            buy[i]=Math.max(sell[i-1],skip[i-1])-prices[i];
            hold[i]=Math.max(hold[i-1],buy[i-1]);
            skip[i]=Math.max(skip[i-1],sell[i-1]);
            sell[i]=Math.max(buy[i-1],hold[i-1])+prices[i]-fee;
        }
        int max=Math.max(sell[prices.length-1],skip[prices.length-1]);
        return Math.max(0,max);
    }

    public static void main(String[] args) {
        int[] price = {2, 3, 1, 8, 4, 9};
        int fee = 2;
        System.out.println(maxProfit(price, fee));
    }
}
