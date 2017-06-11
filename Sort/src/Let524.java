import java.util.List;

/**
 * Created by OovEver on 2017/6/8.
 */
public class Let524 {
    /**
     * 思路
     * 用两个指针i,j分别遍历s与d
     * 对于每次s的遍历与用j遍历d[index]相对比
     * 如多s.charat(i)==d[index].charar(j)
     * j++
     * 如果j等于d[index].length则代码删除s中的元素可以形成d[index
     * 对于长度不同的元素选择长度大的
     * 对于长度相同的元素选择字典顺序小的
     *
     * */
    public String findLongestWord(String s, List<String> d) {
        String longestWord = "";
        int i, j;
        for(int index=0;index<d.size();index++) {
            for( i=0,j=0;i<s.length()&&j<d.get(index).length();i++) {
                if (s.charAt(i) == d.get(index).charAt(j)) {
                    j++;
                }
            }
            if(j==d.get(index).length()&&(longestWord.length()<j||(longestWord.length()==j&&longestWord.compareTo(d.get(index))>0))){
                longestWord = d.get(index);
            }
        }

        return longestWord;
    }


}
