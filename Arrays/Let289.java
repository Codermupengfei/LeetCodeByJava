/**
 * Created by OovEver on 2017/4/15.
 */
public class Let289 {
    //0:死-死
    // 1：活-活
//    2:活-死
//    3：死-活

    public void gameOfLife(int[][] board) {
        int m=board.length;
        int n=board[0].length;
        if(board==null||m==0||n==0)
            return;
        for(int i=0;i<m;i++)
            for(int j=0;j<n;j++){
                int sum=getNeiborNum(board,i,j);
                if(sum==3&&board[i][j]==0)
                   board[i][j]=3;
                else if(board[i][j]==1&&(sum>3||sum<2))
                    board[i][j]=2;
            }
        for(int i=0;i<m;i++)
            for(int j=0;j<n;j++){
                board[i][j]%=2;
            }
    }
    int getNeiborNum(int[][]board,int i,int j){
        int count=0;
        for(int x=i-1;x<=i+1;x++)
            for(int y=j-1;y<=j+1;y++){
                if(x<0||y<0||x>=board.length||y>=board[0].length||(x==i&&y==j))
                    continue;
                 if(board[x][y]==1||board[x][y]==2)
                    count++;
            }
        return count;

    }
}
