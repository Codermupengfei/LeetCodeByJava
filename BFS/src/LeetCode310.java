import java.util.*;

/**
 * Created by OovEver on 2017/11/3.
 * 找到叶子节点
 * 遍历叶子节点，并删除他
 * 找出剩余的最后的一个或者两个节点
 */
public class LeetCode310 {
    public static List<Integer> findMinHeightTrees(int n, int[][] edges) {

        if (n == 1) return Collections.singletonList(0);

        List<Set<Integer>> adj = new ArrayList<>(n);
        for (int i = 0; i < n; ++i) adj.add(new HashSet<>());
        for (int[] edge : edges) {
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }

        List<Integer> leaves = new ArrayList<>();
        for (int i = 0; i < n; ++i)
            if (adj.get(i).size() == 1) leaves.add(i);

        while (n > 2) {
            n -= leaves.size();
            List<Integer> newLeaves = new ArrayList<>();
            for (int i : leaves) {
                int j = adj.get(i).iterator().next();
                adj.get(j).remove(i);
                if (adj.get(j).size() == 1) newLeaves.add(j);
            }
            leaves = newLeaves;
        }
        return leaves;
    }

    public static void main(String[] args) {
        int n = 4;
        int[][] edges = {{1, 0,}, {1, 2}, {1, 3}};
        System.out.println(findMinHeightTrees(n, edges));
    }
}
