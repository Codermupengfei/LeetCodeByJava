/**
 * Created by OovEver on 2017/4/15.
 */
public class Let42 {
    public int trap(int[] height) {
        int res=0;
        int left=0;
        int right=height.length-1;
        while (left<right){
            int minH=Math.min(height[left],height[right]);
            if(minH==height[left]){
                while (++left<right&&height[left]<minH)
                    res+=(minH-height[left]);
            }
            else {
                while (left<--right&&height[right]<minH)
                    res+=(minH-height[right]);
            }


        }
        return res;
    }
}
