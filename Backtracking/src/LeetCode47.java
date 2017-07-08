import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by OovEver on 2017/7/8.
 */
public class LeetCode47 {
    public static List<List<Integer>> permuteUnique(int[] nums) {

        List<List<Integer>> res = new ArrayList<>();
        if (nums.length == 0) {
            return res;
        }
        int[] visited = new int[nums.length];
        Arrays.sort(nums);
        helper(res,new ArrayList<>(),visited,nums);
        return res;
    }

   static void helper(List<List<Integer>> res, List<Integer> temp,int []visit,int[] nums) {
        if (temp.size() == nums.length) {
            res.add(new ArrayList<>(temp));
            return;
        }
        for(int i=0;i<nums.length;i++) {
//            按顺序取数 所以如果前一个没访问，并且前一个和后一个相等
            if (visit[i] == 1 || (i!=0&&nums[i] == nums[i - 1] && visit[i-1] == 0)) {
                continue;
            }
            visit[i] = 1;
            temp.add(nums[i]);
            helper(res, temp, visit, nums);
            temp.remove(temp.size() - 1);
            visit[i] = 0;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2};
        permuteUnique(nums);
    }
}
