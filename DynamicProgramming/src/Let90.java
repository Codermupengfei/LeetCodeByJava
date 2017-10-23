import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by OovEver on 2017/4/10.
 */
public class Let90 {
     static  void DFS(List<List<Integer>> list,List<Integer> temp,int []nums,int pos){
        list.add(new ArrayList<>(temp));
        for(int i=pos;i<nums.length;i++){
            if(i>pos&&nums[i]==nums[i-1])continue;
            temp.add(nums[i]);
            DFS(list,temp,nums,i+1);
            temp.remove(temp.size()-1);
        }
    }
    public static   List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list=new ArrayList<List<Integer>>();
        if(nums==null||nums.length<1)
            return list;
        List<Integer> temp=new ArrayList<Integer>();
        DFS(list,temp,nums,0);
        return list;

    }

    public static void main(String[] args) {

            char[] c={'a'};
            char[] c1={'b'};
        String s1=new String(c);
        String s2=new String(c1);
            String dd=s1+s2;
            System.out.println(dd);



    }
}
