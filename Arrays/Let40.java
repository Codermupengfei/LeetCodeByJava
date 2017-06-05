import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by OovEver on 2017/4/14.
 */
public class Let40 {
    void DFS(List<List<Integer>> list,List<Integer> temp,int []candidates,int sum,int target,int pos){
        if(sum==target){
            list.add(new ArrayList<>(temp));
            return;
        }
        if(sum>target)
            return;
        for(int i=pos;i<candidates.length;i++){
            if(i>pos&&candidates[i]==candidates[i-1])continue;
            temp.add(candidates[i]);
            DFS(list,temp,candidates,sum+candidates[i],target,i+1);
            temp.remove(temp.size()-1);
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> list=new ArrayList<List<Integer>>();
        List<Integer> temp=new ArrayList<Integer>();
        DFS(list,temp,candidates,0,target,0);
        return list;
    }
}
