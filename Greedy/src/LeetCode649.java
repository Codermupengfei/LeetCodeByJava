import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by OovEver on 2017/11/1.
 */
public class LeetCode649 {
    public static String predictPartyVictory(String senate) {
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        int n = senate.length();
        for(int i=0;i<senate.length();i++) {
            if (senate.charAt(i) == 'R') {
                q1.add(i);
            } else q2.add(i);
        }
        while(!q1.isEmpty() && !q2.isEmpty()){
            int r1_index=q1.poll();
            int r2_index = q2.poll();
            if (r1_index < r2_index) {
//                R有权利，删除D，将R放在第二轮
                q1.add(r1_index + n);
            } else {
//                D有权利，删除R，将D放在第二轮
                q2.add(r2_index + n);
            }
        }
//        最后谁还活着，谁的权利大
        return q1.size()>q2.size()?"Radiant" : "Dire";
    }
    public static void main(String[] args) {
        Queue<Integer> q1 = new LinkedList<>();
        q1.add(1);
        q1.add(2);
        System.out.println(q1.poll());
        String senate = "RDD";
        System.out.println(predictPartyVictory(senate));
    }
}
