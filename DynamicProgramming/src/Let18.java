import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by OovEver on 2017/4/19.
 */
public class Let18 {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res=new ArrayList<List<Integer>>();
        if(nums.length<4)
            return res;
            int n=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n-3;i++) {
            if(i>0&&nums[i]==nums[i-1])
                continue;
            for (int j = i + 1; j < n - 2; j++) {
                if(j>i+1&&nums[j]==nums[j-1])
                    continue;
                int begin = j + 1;
                int end = n - 1;
                while (begin<end){
                    int sum=nums[i]+nums[j]+nums[begin]+nums[end];
                    if(sum==target){
                        List<Integer> temp=new ArrayList<Integer>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[begin]);
                        temp.add(nums[end]);
                        res.add(temp);
                        end--;
                        begin++;
                        while (begin<end&&nums[begin]==nums[begin-1])begin++;
                        while (begin<end&&nums[end]==nums[end+1])end--;
                    }
                    if(sum>target){
                        end--;
                        while (begin<end&&nums[end]==nums[end+1])end--;
                    }else if(sum<target){
                        begin++;
                        while (begin<end&&nums[begin]==nums[begin-1])begin++;
                    }
                }


            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums={1,0,-1,0,-2,2};
        int target=0;
        fourSum(nums,target);

    }
}
