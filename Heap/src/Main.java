import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Created by OovEver on 2017/9/27.
 */
public class Main {
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
       // Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        getResult(result, new ArrayList<Integer>(), candidates, target, 0);
        return result;
    }

    private static void getResult(List<List<Integer>> result, List<Integer> cur, int candidates[], int target, int start){
        if(target > 0){
            for(int i = start; i < candidates.length && target >= candidates[i]; i++){
                cur.add(candidates[i]);
                getResult(result, cur, candidates, target - candidates[i], i);
                cur.remove(cur.size() - 1);
            }//for
        }//if
        else if(target == 0 ){
            result.add(new ArrayList<Integer>(cur));
        }//else if
    }
    private static int findMaxMolecules(int massA, int massB, int massC, int massD, int massX) {
        int massC2 = 2 * massC;
        int massD2 = 2 * massD;
        int[][] nums = {{massA, 1}, {massB, 1}, {massC2, 2}, {massD2, 2}};
//

        Arrays.sort(nums, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });
        int [][]nums2=new int[2][4];
        for(int i=0;i<2;i++) {
            for(int j=0;j<4;j++) {
                nums2[i][j] = nums[j][i];
            }
        }
        for(int i=0;i<nums2.length;i++) {
            for(int j=0;j<nums2[0].length;j++) {
                System.out.print(nums2[i][j]+" ");
            }
            System.out.println();
        }
        List<List<Integer>> result=combinationSum(nums2[0],massX);
        int max = 0;
        for(int i=0;i<result.size();i++) {
            int sum = 0;
            if (max < result.get(i).size()) {
                max = result.get(i).size();
            }
        }
        return max;
    }

    public static void main(String[] args) {
        findMaxMolecules(5, 4, 3, 2, 1);
    }
}
