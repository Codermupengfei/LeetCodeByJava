import java.util.*;

/**
 * Created by OovEver on 2017/11/4.
 */
public class Leetcode332 {
    public static List<String> findItinerary(String[][] tickets) {
        List<String>                       result = new ArrayList<String>();
        Map<String, PriorityQueue<String>> graph  = new HashMap();
        for (String[] iter : tickets) {
            if(!graph.containsKey(iter[0]))
            graph.put(iter[0], new PriorityQueue<String>());
            graph.get(iter[0]).add(iter[1]);
        }

        Stack<String> stack = new Stack<String>();
        stack.push("JFK");
        while (!stack.isEmpty()) {
            while (graph.containsKey(stack.peek()) && !graph.get(stack.peek()).isEmpty()) {
                //先进去的说明是出发城市，那么最先出发的城市最后出来
                stack.push(graph.get(stack.peek()).poll());
            }
            result.add(0, stack.pop());
        }
        return result;
    }

    public static void main(String[] args) {
        String[][] tickets = {{"JFK", "KUL"}, {"JFK", "NRT"}, {"NRT", "JFK"}};

        System.out.println(findItinerary(tickets));

    }
}
