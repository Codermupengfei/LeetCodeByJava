import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by OovEver on 2017/8/28.
 */
public class MyUtil {
    private MyUtil() {
//          这个异常大家肯定都经常遇到，异常的解释是"程序遇上了空指针"，简单地说就是调用了未经初始化的对象或者是不存在的对象
        throw new AssertionError();
    }

    public static int countWordFile(String fileName, String word) {
        int count = 0;
        try(FileReader fileReader = new FileReader(fileName)) {
            try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
                String line=null;
                int index = -1;
                while ((line = bufferedReader.readLine()) != null) {
                    while (line.length() >= word.length() && (index = line.indexOf(word))>=0) {
                        count++;
                        line = line.substring(index, index + word.length());
                    }
                }
            }

        }catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return count;
    }
}
