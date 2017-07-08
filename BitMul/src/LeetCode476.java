/**
 * Created by OovEver on 2017/7/6.
 */
public class LeetCode476 {
    public int findComplement(int num) {
        int mask = 1;
        int temp = num;
        while (temp != 0) {
            mask = mask << 1;
            temp = temp >> 1;
        }
        return num ^ (mask - 1);
    }

//    int mask = (Integer.highestOneBit(num) << 1) - 1;
//    return mask ^ num;
}
