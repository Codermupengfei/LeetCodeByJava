import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by OovEver on 2017/7/11.
 * 思路
 * hashmap存储list1的内容
 * 遍历list2看list2中是否存在list1的内容
 * 如果存在
 * 看list2与list1下标和是否小于当前的最小值
 * 小于的话更新最小值 并将result清空
 * 否则将当前的元素添加的result中
 */
public class LeetCode599 {
    public String[] findRestaurant(String[] list1, String[] list2) {
        int minVal = Integer.MAX_VALUE;
        List<String> result = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        for(int i=0;i<list1.length;i++) {
            map.put(list1[i], i);
        }
        for(int j=0;j<list2.length;j++) {
            Integer index = map.get(list2[j]);
            if (index != null&&index+j<=minVal) {
                if (index + j < minVal) {
                    minVal = index + j;
                    result = new ArrayList<>();
                }
                result.add(list2[j]);

            }


        }
        return result.toArray(new String[result.size()]);
    }

}
