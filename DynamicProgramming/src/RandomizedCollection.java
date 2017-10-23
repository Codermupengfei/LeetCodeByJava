import java.util.*;

/**
 * Created by OovEver on 2017/4/19.
 */
public class RandomizedCollection {
    List<Integer>list;
    HashMap<Integer,Set<Integer>>hm;
    Random rand;
    /** Initialize your data structure here. */
    public RandomizedCollection() {
        list=new ArrayList<>();
        hm=new HashMap<Integer, Set<Integer>>();
        rand=new Random();
    }

    /** Inserts a value to the collection. Returns true if the collection did not already contain the specified element. */
    public boolean insert(int val) {
        boolean flag=!hm.containsKey(val);
        if(flag){
            hm.put(val,new LinkedHashSet<Integer>());
        }
        list.add(val);
        hm.get(val).add(list.size()-1);
        return flag;
    }

    /** Removes a value from the collection. Returns true if the collection contained the specified element. */
    public boolean remove(int val) {
        if(!hm.containsKey(val))
            return false;
        int ind=hm.get(val).iterator().next();//获取第一个元素的位置
        hm.get(val).remove(ind);
        if(ind<list.size()-1){
            int lastElement=list.get(list.size()-1);
            list.set(ind,lastElement);
            hm.get(lastElement).remove(list.size()-1);
            hm.get(lastElement).add(ind);
        }
        list.remove(list.size()-1);
        if(hm.get(val).size()==0)
            hm.remove(val);
        return true;

    }

    /** Get a random element from the collection. */
    public int getRandom() {
        return list.get(rand.nextInt(list.size()));
    }

    public static void main(String[] args) {
        HashMap<Integer,Set<Integer>> map=new HashMap<Integer, Set<Integer>>();
        map.put(1,new LinkedHashSet<Integer>());
        map.get(1).add(1);
        map.get(1).add(2);

        int mid=map.get(1).iterator().next();
        System.out.println(mid);
        map.get(1).remove(mid);
        mid=map.get(1).iterator().next();
        System.out.println(mid);
    }
}
