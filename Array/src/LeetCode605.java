/**
 * Created by OovEver on 2017/7/16.
 * 贪心法
 * 如果当前的数为0
 * 找出数组前面和后面的两个数字
 * 判断是否为0  如果为0当前能放花
 * 可以放花的次数加一
 * 最后判断放花的次数是否为n
 */
public class LeetCode605 {
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        for(int i=0;i<flowerbed.length&&count<n;i++) {
            if (flowerbed[i] == 0) {
                int next = (i == flowerbed.length - 1) ? 0 : flowerbed[i + 1];
                int pre = (i == 0) ? 0 : flowerbed[i - 1];
                if (next == 0 && pre == 0) {
                    flowerbed[i] = 1;
                    count++;
                }
            }

        }
        return count == n;
    }

    public static void main(String[] args) {
        int[] nums = {1, 0, 0, 0, 1, 2};
        System.out.println(canPlaceFlowers(nums, 2));
    }
}
