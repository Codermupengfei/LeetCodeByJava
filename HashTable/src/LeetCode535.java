import java.util.ArrayList;
import java.util.List;

/**
 * Created by OovEver on 2017/7/11.
 * 思路
 * 编码时
 * 将地址存储到list集合中，并返回List.size-1
 * 解码时根据传入的list从List进行获取
 * 2.用地址的hashcode也可以完成
 */
public class LeetCode535 {
    List<String> list = new ArrayList<>();
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        list.add(longUrl);
        return String.valueOf(list.size() - 1);
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        int index = Integer.valueOf(shortUrl);
        return (index < list.size()) ? list.get(index) : "";
    }
}
