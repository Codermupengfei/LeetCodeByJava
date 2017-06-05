/**
 * Created by OovEver on 2017/4/4.
 */
public class Let121BTime {
    public int maxProfit(int[] prices) {
        if(prices.length==0){
            return 0;
        }
        int profile=0;
        int temp=0;
        int low=prices[0];
        for(int i=0;i<prices.length;i++)
            if(prices[i]<low) low=prices[i];
            else {
                temp=prices[i]-low;
                if(temp>profile){
                    profile=temp;
                }

            }

        return profile;
    }
}
