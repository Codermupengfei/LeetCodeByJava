/**
 * Created by OovEver on 2017/4/14.
 */
public class Let74 {
    public boolean searchMatrix(int[][] matrix, int target) {
        boolean flag=false;
        if(matrix.length==0)
            return false;
        int row=matrix.length;
        int col=matrix[0].length;
        int begin=0;
        int end=row*col-1;
        while (begin<=end){
            int mid=(begin+end)/2;
            int mid_value=matrix[mid/col][mid%col];
            if(mid_value==target)
                return true;
            if(mid_value<target){
                begin++;
            }else {
                end--;
            }
        }
        return flag;
    }
}
