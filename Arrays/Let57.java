/**
 * Created by OovEver on 2017/4/18.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Let57 {
    public class Interval {
        int start;
        int end;
        Interval() { start = 0; end = 0; }
        Interval(int s, int e) { start = s; end = e; }
    }
    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        List<Interval> res=new ArrayList<Interval>();
        int[]left=new int[intervals.size()+1];
        int[]right=new int[intervals.size()+1];
        for(int i=0;i<intervals.size();i++){
            left[i]=intervals.get(i).start;
            right[i]=intervals.get(i).end;
        }
        if(newInterval!=null){
            left[left.length-1]=newInterval.start;
            right[right.length-1]=newInterval.end;
        }
        Arrays.sort(left);
        Arrays.sort(right);
        for(int i=0,j=0;i<left.length;i++){
            if(i==left.length-1||left[i+1]>right[i]){
                res.add(new Interval(left[j],right[i]));
                j=i+1;
            }
        }
        return res;
    }
}



