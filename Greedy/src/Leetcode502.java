import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Created by OovEver on 2017/6/10.
 */
public class Leetcode502 {
    /**
     * 用两个优先队列来维护
     * 1.第一个优先队列按照所需的资金由小到大排序
     * 2.第二个优先队列按照收益的大小从大到小拍讯
     * 3.每次出队的时候将第二个队列中的最顶端的元素出队然后加上收益即可
     * */
    public int findMaximizedCapital(int k, int W, int[] Profits, int[] Capital) {
        PriorityQueue<int []> firstQueue=new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });
        PriorityQueue<int []> second=new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o2[1]-o1[1];
            }
        });
        for(int i=0;i<Profits.length;i++) {
//            为第一个栈中按所需资金从小到大排序
            firstQueue.add(new int[]{Capital[i], Profits[i]});
        }
        for(int i=0;i<k;i++) {
            //队列不为空并且所需资金小于手中的w
            while (!firstQueue.isEmpty()&&firstQueue.peek()[0]<=W){
                second.add(firstQueue.poll());
            }
            if(second.isEmpty()) break;
            W+=second.poll()[1];
        }
        return W;
    }
}
