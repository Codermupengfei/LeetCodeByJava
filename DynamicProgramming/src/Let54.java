import java.util.ArrayList;
import java.util.List;

/**
 * Created by OovEver on 2017/4/16.
 */
public class Let54 {
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res=new ArrayList<Integer>();
        if(matrix.length==0||matrix[0].length==0)
            return res;
        int rowStart=0;
        int m=matrix.length;
        int n=matrix[0].length;
        int rowEnd=matrix.length-1;
        int colStart=0;
        int colEnd=matrix[0].length-1;
        while (rowStart<=colEnd&&colStart<=colEnd) {
            for (int i = colStart; i <=colEnd; i++) {
                res.add(matrix[rowStart][i]);
            }
            rowStart++;
            if(rowStart>rowEnd)
                break;
            for (int i = rowStart; i <=rowEnd; i++) {
                res.add(matrix[i][colEnd]);
            }
            colEnd--;
            if(colStart>colEnd)
                break;
            for (int i = colEnd; i >= colStart; i--) {
                res.add(matrix[rowEnd][i]);
            }
            rowEnd--;
            if(rowStart>rowEnd)
                break;
            for (int i = rowEnd ; i >= rowStart; i--) {
                res.add(matrix[i][colStart]);
            }
            colStart++;
            if(colStart>colEnd)
                break;
        }
        return res;

    }

    public static void main(String[] args) {
        int[][]nums={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        spiralOrder(nums);

    }
}
