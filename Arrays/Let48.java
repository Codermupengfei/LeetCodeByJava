/**
 * Created by OovEver on 2017/4/13.
 */
public class Let48 {
    public static void rotate(int[][] matrix) {
        for(int i=0;i<matrix.length;i++)
            for(int j=i;j<matrix[0].length;j++){
                int temp;
                temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        for(int i=0;i<matrix.length;i++)
            for(int j=0;j<matrix.length/2;j++){
                int temp;
                temp=matrix[i][j];
                matrix[i][j]=matrix[i][matrix.length-1-j];
                matrix[i][matrix.length-1-j]=temp;
            }
        for(int i=0;i<matrix.length;i++)
            for(int j=0;j<matrix.length;j++){
                System.out.println(matrix[i][j]);
            }
    }

    public static void main(String[] args) {
        int[][] matrix={{1,2},{3,4}};
        rotate(matrix);
    }
}
