/**
 * Created by OovEver on 2017/10/31.
 */
public class LeetCode542 {
    public int[][] updateMatrix(int[][] matrix) {
        if(matrix.length==0) return matrix;

        for(int i = 0; i<matrix.length; i++)
            for(int j = 0; j<matrix[0].length; j++)
                if(matrix[i][j]==1&&!hasNeiberZero(i, j,matrix))
                    matrix[i][j] = matrix.length+matrix[0].length+1;

        for(int i = 0; i<matrix.length; i++)
            for(int j = 0; j<matrix[0].length; j++)
                if(matrix[i][j]==1)
                    dfs(matrix, i, j, -1);

        return matrix;
    }
    private void dfs(int[][] matrix, int x, int y, int val){
        if(x<0||y<0||y>=matrix[0].length||x>=matrix.length||matrix[x][y]<=val)
            return;

        if(val>0) matrix[x][y] = val;

        dfs(matrix, x+1, y, matrix[x][y]+1);
        dfs(matrix, x-1, y, matrix[x][y]+1);
        dfs(matrix, x, y+1, matrix[x][y]+1);
        dfs(matrix, x, y-1, matrix[x][y]+1);

    }
    private boolean hasNeiberZero(int x, int y, int[][] matrix){
        if(x>0&&matrix[x-1][y]==0) return true;
        if(x<matrix.length-1&&matrix[x+1][y]==0) return true;
        if(y>0&&matrix[x][y-1]==0) return true;
        if(y<matrix[0].length-1&&matrix[x][y+1]==0) return true;

        return false;
    }

    public static void main(String[] args) {
        LeetCode542 test = new LeetCode542();
        int[][] matrix = {{1, 1, 1}, {1, 1, 1}, {1, 1, 0}};
        test.updateMatrix(matrix);
        for(int i=0;i<matrix.length;i++) {
            for(int j=0;j<matrix[0].length;j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }


    }
}
