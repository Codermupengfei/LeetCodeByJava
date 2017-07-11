/**
 * Created by OovEver on 2017/7/10.
 */
public class LeetCode553 {
    public String optimalDivision(int[] nums) {
        if (nums.length == 0) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        if (nums.length == 1) {
            stringBuilder.append(nums[0]);
            return stringBuilder.toString();
        }
        if (nums.length == 2) {
            stringBuilder.append(nums[0]);
            stringBuilder.append("/");
            stringBuilder.append(nums[1]);
            return stringBuilder.toString();
        }
        stringBuilder.append(nums[0]);
        stringBuilder.append("/");
        StringBuilder temp = new StringBuilder();
        temp.append(nums[1]);
        for(int i=2;i<nums.length;i++) {
            temp.append("/");
            temp.append(nums[i]);
        }
        stringBuilder.append("(");
        stringBuilder.append(temp);
        stringBuilder.append(")");
        return stringBuilder.toString();

    }
}
