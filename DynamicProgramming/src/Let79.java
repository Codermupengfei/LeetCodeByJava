/**
 * Created by OovEver on 2017/4/16.
 */
public class Let79 {
    public boolean exist(char[][] board, String word) {
        boolean flag=false;
        if(board.length==0||board[0].length==0)
            return false;
        int m=board.length;
        int n=board[0].length;
        boolean[][] isVal=new boolean[m][n];
        for(int i=0;i<m;i++)
            for(int j=0;j<n;j++){
                if(existChar(board,i,j,0,word,isVal))
                    return true;
            }
        return flag;
    }
    public boolean existChar(char[][]board,int x,int y,int location,String word, boolean[][] isVal){
        char tmpChar=word.charAt(location);
        location++;
        boolean flag=false;
        if(tmpChar!=board[x][y])
            return false;
        else {
            isVal[x][y]=true;
            if(location==word.length())
                return true;
            if(x>0&&!isVal[x-1][y])
                flag=flag||existChar(board,x-1,y,location,word,isVal);
            if(x<board.length-1&&!isVal[x+1][y])
                flag=flag||existChar(board,x+1,y,location,word,isVal);
            if(y>0&&!isVal[x][y-1])
                flag=flag||existChar(board,x,y-1,location,word,isVal);
            if(y<board[0].length-1&&!isVal[x][y+1])
                flag=flag||existChar(board,x,y+1,location,word,isVal);
            if(!flag)
                isVal[x][y]=false;
        }
        return flag;
    }
}
