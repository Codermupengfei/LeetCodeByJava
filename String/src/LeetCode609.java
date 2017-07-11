import java.util.*;

/**
 * Created by OovEver on 2017/7/11.
 * 思路
 * 用哈希表处理
 * 首先建立哈希表
 * 遍历paths数组并用“\\+”分割空格字符
 * 找出第一次出现（的位置
 * 位置左边是路径
 * 右边是内容，在哈希表中判断该内容是否有存在的路径
 * 并对路径进行添加
 * 之后更新map表
 * 以key的方式遍历Keyset
 * 看当前Key的size是否大于2
 * 大于2就将结果放到哈希表中
 */
public class LeetCode609 {
    public static List<List<String>> findDuplicate(String[] paths) {
        List<List<String>> result = new ArrayList<>();
        if (paths.length == 0) {
            return result;
        }
        Map<String, Set<String>> map = new HashMap();
        for (String path : paths) {
//            分割空白字符
            String[] strings = path.split("\\s+");
            for(int i=1;i<strings.length;i++) {
                int idx = strings[i].indexOf("(");
                String content = strings[i].substring(idx);
                String fileName =strings[0]+"/"+strings[i].substring(0, idx);
                Set<String> fileNames = map.getOrDefault(content, new HashSet<>());
                fileNames.add(fileName);
                map.put(content, fileNames);

            }


        }
        for (String key : map.keySet()) {
            if (map.get(key).size()>1) {
                result.add(new ArrayList<>(map.get(key)));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String[] path = {"root/a 1.txt(abcd) 2.txt(efgh)","root/c 3.txt(abcd)","root/c/d 4.txt(efgh)","root 4.txt(efgh)"};
        findDuplicate(path);
    }
}
