/**
 * Created by OovEver on 2017/7/12.
 * 思路
 * 注意理解题意
 * 此题的意思是一个数是否为其所有的因子分解的和
 * 从2到sqrt(num)遍历
 * 判断是否能被num整除
 * 如果能被num整除，则sum加上这个数
 * 判断这个数的平方是否等于num等于则加0
 * 不等于加num/i
 * 运用一个数学规律 在sqrt的左右分别处理
 * 一个数如果是num的因子 则num除以这个因子 的数还是这个数的因子
 * 且这个因子在sqrt后面
 */
public class LeetCode507 {
    public boolean checkPerfectNumber(int num) {
        if (num <= 1) {
            return false;
        }
        int sum = 1;
        for(int i=2;i<=Math.sqrt(num);i++) {
            if (num % i == 0) {
                sum += i + (i * i == num ? 0 : num / i);
            }

        }
        return sum == num;
    }
}
