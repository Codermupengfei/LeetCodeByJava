/**
 * Created by OovEver on 2017/7/8.
 * http://www.bubuko.com/infodetail-1435043.html
 * 思路:
 * 对所有的数求异或
 * 两个相同的数之间求疑惑后为0
 * 所有数异或后的结果就是两个不同的数异或的结果
 * 由于两个不同的数异或 所以异或结果必有一位为1
 * 选取最低位为1的与num进行异或
 * 用异或后的结果为0或者为1区分两个数
 */
public class LeetCode260 {
    public int[] singleNumber(int[] nums) {
        int diff = 0;
        for (int num : nums) {
            diff ^= num;
        }
        diff = diff & (-diff);
        int[] res = new int[2];
        for (int num : nums) {
            if ((num & diff) == 0) {
                res[0] ^= num;
            } else {
                res[1] ^= num;
            }
        }
        return res;
    }
}
