/**
 * Created by OovEver on 2017/4/13.
 */
public class Let59 {
    public static int[][] generateMatrix(int n) {
        int rowEnd=n-1;
        int colEnd=n-1;
        int rowStart=0;
        int colStart=0;
        int [][]Martix=new int[n][n];
        int num=1;
        while (rowStart<=rowEnd&&colStart<=colEnd){
            for(int i=colStart;i<=colEnd;i++){
                Martix[rowStart][i]=num++;
            }
            rowStart++;
            for(int i=rowStart;i<=rowEnd;i++){
                Martix[i][colEnd]=num++;
            }
            colEnd--;
            for(int i=colEnd;i>=colStart;i--){
                Martix[rowEnd][i]=num++;
            }
            rowEnd--;
            for(int i=rowEnd;i>=rowStart;i--){
                Martix[i][colStart]=num++;
            }
            colStart++;

        }
        return Martix;
    }

    public static void main(String[] args) {
        int n=3;
        generateMatrix(n);
    }
}
