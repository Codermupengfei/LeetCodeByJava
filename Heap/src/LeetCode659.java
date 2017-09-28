import java.util.*;

/**
 * Created by OovEver on 2017/9/27.
 * Map + PriorityQueue

 思路类似于排列扑克牌，优先将数字排在长度较小的扑克牌队列后面

 Map<Integer, PriorityQueue<Integer>> dmap的key为扑克牌队列的末尾，value为优先队列，存储扑克牌队列的长度
 */
public class LeetCode659 {
//    private static HashMap<Integer, PriorityQueue<Integer>> dmap;
//    public static boolean isPossible(int[] nums) {
//        dmap = new HashMap<>();
//        for (int num : nums) {
//            PriorityQueue<Integer> pq0 = getOrPut(num - 1);
//            int len = pq0.isEmpty() ? 0 : pq0.poll();
//            PriorityQueue<Integer> pq1 = getOrPut(num);
//            pq1.offer(len + 1);
//        }
//        for (int key : dmap.keySet()) {
//            for (int len : dmap.get(key)) {
//                if (len < 3) return false;
//            }
//        }
//        return true;
//    }
//    public static PriorityQueue<Integer> getOrPut(int num) {
//        PriorityQueue<Integer> pq = dmap.get(num);
//        if (pq == null) {
//            pq = new PriorityQueue<Integer>();
//            dmap.put(num, pq);
//        }
//        return pq;
//    }
//
//    public static void main(String[] args) {
//        int[] num = {1, 2, 3, 3, 4, 5};
//        System.out.println(isPossible(num));
//    }
public boolean isPossible(int[] nums) {
    Map<Integer, Integer> freq = new HashMap<>(), appendfreq = new HashMap<>();
    for (int i : nums) freq.put(i, freq.getOrDefault(i,0) + 1);
    for (int i : nums) {
        if (freq.get(i) == 0) continue;
        else if (appendfreq.getOrDefault(i,0) > 0) {
            appendfreq.put(i, appendfreq.get(i) - 1);
            appendfreq.put(i+1, appendfreq.getOrDefault(i+1,0) + 1);
        }
        else if (freq.getOrDefault(i+1,0) > 0 && freq.getOrDefault(i+2,0) > 0) {
            freq.put(i+1, freq.get(i+1) - 1);
            freq.put(i+2, freq.get(i+2) - 1);
            appendfreq.put(i+3, appendfreq.getOrDefault(i+3,0) + 1);
        }
        else return false;
        freq.put(i, freq.get(i) - 1);
    }
    return true;

}

    public static void main(String[] args) {
        int[][] nums = {{1, 2, 3},{4,5,6}};
        Arrays.sort(nums, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });
        for(int i=0;i<nums.length;i++) {
            for(int j=0;j<nums[0].length;j++) {
                System.out.println(nums[i][j]);
            }
        }

    }
}
