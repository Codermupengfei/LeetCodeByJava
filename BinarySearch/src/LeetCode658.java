import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by OovEver on 2017/10/31.
 */
public class LeetCode658 {
    public static List<Integer> findClosestElements(int[] arr, int k, int x) {
        int lo=0;
        int hi=arr.length-k;
        while(lo<hi){
            int mid=(lo+hi)/2;
            if(x-arr[mid]>arr[mid+k]-x){
                lo=mid+1;
            }else{
                hi=mid;
            }
        }
        List<Integer> res = new ArrayList<>();
        for(int i=lo;i<lo+k;i++) {
            res.add(arr[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(findClosestElements(arr, 4, 3));
    }

}
