/**
 * Created by OovEver on 2017/7/6.
 */
public class LeetCode331 {
    public static boolean isValidSerialization(String preorder) {
        String[] nodes = preorder.split(",");
        int diff = 1;
        for (String node : nodes) {
            if(--diff<0) return false;
            if (!node .equals("#")) {
                diff += 2;
            }
        }
        return diff == 0;
    }

    public static void main(String[] args) {
        String preorder = "1";
        System.out.println(isValidSerialization(preorder));
    }
}
