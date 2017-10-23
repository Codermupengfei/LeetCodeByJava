/**
 * Created by OovEver on 2017/4/9.
 */
public class Let495 {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        if(timeSeries.length==0||duration==0)
            return 0;
        if(timeSeries.length==1)
            return duration;
        int sumTime=0;
        int startSeries=timeSeries[0];
        for(int i=1;i<timeSeries.length;i++){
            if(timeSeries[i]-startSeries>duration){
                sumTime+=duration;
                startSeries=timeSeries[i];
            }else {
                sumTime+=timeSeries[i]-startSeries;
                startSeries=timeSeries[i];
            }
        }
        sumTime+=duration;
        return sumTime;
    }
}
