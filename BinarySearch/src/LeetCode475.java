import java.util.Arrays;

/**
 * Created by OovEver on 2017/6/24.
 * 思路
 * 对房子和加热器进行排序
 * 按照顺序找到屋子之间的最小差
 * 所有差之间最大的那个就是需要的结果
 */
public class LeetCode475 {
    public int findRadius(int[] houses, int[] heaters) {
        int hoL=houses.length;
        int heL = heaters.length;
        int radius = 0;
        Arrays.sort(houses);
        Arrays.sort(heaters);
        int j=0;
        for(int i=0;i<hoL;i++) {
            while (j < heL - 1 && Math.abs(houses[i] - heaters[j]) >= Math.abs(houses[i] - heaters[j + 1])) {
                j++;
            }
            radius = Math.max(radius, Math.abs(houses[i] - heaters[j]));
        }
        return radius;
    }
}
