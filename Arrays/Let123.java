/**
 * Created by OovEver on 2017/4/15.
 */
public class Let123 {
    public int maxProfit(int[] prices) {
        if(prices.length<2)
            return 0;
        int n=prices.length;
        int[]profile1=new int[n];
        int[]profile2=new int[n];
        int minProfile=prices[0];
        for(int i=1;i<prices.length;i++){
            minProfile=Math.min(minProfile,prices[i]);
            profile1[i]=Math.max(profile1[i-1],prices[i]-minProfile);
        }
        int maxProfile=prices[n-1];
        for(int i=n-2;i>=0;i--){
            maxProfile=Math.max(prices[i],maxProfile);
            profile2[i]=Math.max(profile2[i+1],maxProfile-prices[i]);
        }
        int result=0;
        for(int i=0;i<prices.length;i++){
            result =Math.max(result,profile1[i]+profile2[i]);
        }
        return result;
    }

    public static void main(String[] args) {

    }
}
