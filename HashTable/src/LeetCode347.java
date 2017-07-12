import com.sun.corba.se.impl.orbutil.ObjectStreamClass_1_3_1;

import java.util.*;

/**
 * Created by OovEver on 2017/7/11.
 */
public class LeetCode347 {
    public static List<Integer> topKFrequent(int[] nums, int k) {
        if (nums.length == 0) {
            return new ArrayList<Integer>();
        }
        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
//        对Map按值进行排序
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o2.getValue() - o1.getValue();
            }
        });
       for(int i=0;i<k;i++) {
           result.add(list.get(i).getKey());
       }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 1,1, 2,2,2, 3};
        System.out.println(topKFrequent(nums,2));

    }
}
