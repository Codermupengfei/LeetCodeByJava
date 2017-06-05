import java.util.ArrayList;
import java.util.List;

/**
 * Created by OovEver on 2017/4/16.
 */
public class Let229 {
    public List<Integer> majorityElement(int[] nums) {
        List res=new ArrayList<>();
        if(nums.length==1)
        {
            res.add(nums[0]);
            return res;
        }
        int temp=nums.length/3;
        int m=0;
        int n=0;
        int cm=0;
        int cn=0;
        for(int num:nums){
            if(num==m){
                cm++;
            }else if(num==n){
                cn++;
            }else if(cm==0){
                m=num;
                cm++;
            }else if(cn==0){
                n=num;
                cn++;
            }
            else {
                cm--;
                cn--;
            }
        }
        cm=0;
        cn=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==m)cm++;
            else if(nums[i]==n)cn++;
        }
        if(cm>temp)res.add(m);
        if(cn>temp)res.add(n);
        return res;
    }
}
