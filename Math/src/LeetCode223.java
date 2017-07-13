import org.omg.CORBA.INTERNAL;

/**
 * Created by OovEver on 2017/7/13.
 * 思路
 * 此题求两个矩阵覆盖的最大面积
 * 根据矩阵公式
 * 用两个矩阵的面积和相加减去他们共同的部分即可
 * 关键是求共同的部分
 */
public class LeetCode223 {
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int areaA = (C - A) * (D - B);
        int areaB = (G - E) * (H - F);
        int left = Math.max(A, E);
        int right = Math.min(G, C);
        int top = Math.min(D, H);
        int bootom = Math.max(F, B);
        int overlap = 0;
        if (left < right && top > bootom) {
            overlap = (top - bootom) * (right - left);
        }
        return areaA + areaB - overlap;

    }
}
