/**
 * Created by OovEver on 2017/4/8.
 */
public class Let167 {
    public static int[] twoSum(int[] numbers, int target) {
        int[] two=new int[2];
       if(numbers==null||numbers.length<1)return null;
        int i=0;
        int j=numbers.length-1;
        int sum=0;
        while (i<j){
            sum=numbers[i]+numbers[j];
            if(sum>target){
                --j;
            }else if(sum<target){
                i++;
            }else if(sum==target){
                two[0]=i+1;
                two[1]=j+1;return two;
            }
        }

        return two;
    }

    public static void main(String[] args) {
        int[] nums={-1,0};
        twoSum(nums,-1);
    }
}
