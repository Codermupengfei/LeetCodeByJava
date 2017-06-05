import java.util.*;

/**
 * Created by OovEver on 2017/4/13.
 */
public class RandomizedSet {
    List<Integer> list=new ArrayList<Integer>();
    Map<Integer,Integer> map=new HashMap<Integer, Integer>();
    /** Initialize your data structure here. */
    public RandomizedSet() {

    }

    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if(map.containsKey(val)) return false;
         map.put(val,map.size());
         list.add(val);
        return true;
    }

    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if(!map.containsKey(val))
            return false;
        int iIndex=map.remove(val);
        if(iIndex<list.size()-1){
            list.set(iIndex,list.get(list.size()-1));
            map.put(list.get(list.size()-1),iIndex);

        }
        list.remove(list.size()-1);
        return true;
    }

    /** Get a random element from the set. */
    Random r=new Random();
    public int getRandom() {
        return list.get(r.nextInt(list.size()));//nexInt里面的数是随机数的上限
    }
}
