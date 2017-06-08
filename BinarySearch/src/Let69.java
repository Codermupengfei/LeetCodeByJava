/**
 * Created by OovEver on 2017/6/8.
 */
public class Let69 {
    public int mySqrt(int x) {
        int res=0;
        if (x == 0) {
            return 0;
        }
        if (x == 1) {
            return 1;
        }
        int left=0;
        int right=x/2;
        while (left <= right) {
            long middle = (left + right) / 2;
            if (middle*middle == x) {
                return (int)middle;
            } else if (middle*middle > x) {
                right = (int)middle - 1;
            }else {
                left = (int)middle + 1;
            }
        }
        return right;
    }
}
