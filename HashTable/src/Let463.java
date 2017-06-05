/**
 * Created by OovEver on 2017/5/2.
 */
public class Let463 {
    public int islandPerimeter(int[][] grid) {
        int edge=0;
        int repeat=0;
        int res=0;
        if(grid.length==0||grid[0].length==0)
            return 0;
        for(int i=0;i<grid.length;i++)
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==0)
                    continue;
                edge++;
                if(i!=0&&grid[i-1][j]==1)
                    repeat++;
                if(j!=0&&grid[i][j-1]==1)
                    repeat++;

            }
        res=4*edge-2*repeat;
        return res;
    }
}
