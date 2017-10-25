/**
 * Created by OovEver on 2017/10/25.
 */
public class LeetCode6 {
    public static String convert(String s, int nRows) {
        if (nRows <= 0) {
            return "";
        }
        if (nRows == 1 || s.length() <=nRows) {
            return s;
        }
        int len = s.length();
        StringBuilder builder = new StringBuilder();
        for(int i=0;i<len&&i<nRows;i++) {
            int start=i;
            builder.append(s.charAt(start));
            for(int j=1;start<len;j++) {
                if (i == 0 || i == nRows - 1) {
                    start = start + 2 * nRows - 2;
                } else {
                    if (j % 2 == 1) {
                        start = start + 2 * (nRows - i - 1);
                    } else {
                        start = start + 2 * i;
                    }
                }
                if (start < len) {
                    builder.append(s.charAt(start));
                }
            }
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        String s = "PAHNAPLSIIGYIR";
        System.out.println(convert(s, 5));

    }
}
