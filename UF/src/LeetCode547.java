/**
 * Created by OovEver on 2017/10/10.
 */
public class LeetCode547 {
    private static int getF(int children,int []f){
        if(f[children]==children){
            return children;
        }else{
            f[children]=getF(f[children],f);
            return f[children];
        }
    }
    private static void merge(int node1,int node2,int []f){
        int t1=getF(node1,f);
        int t2=getF(node2,f);
        if(t1!=t2){
            f[t2]=t1;
        }
        return;
    }
    public static int findCircleNum(int[][] M) {
        if(M.length==0||M[0].length==0){
            return 0;
        }
        int row=M.length;
        int col=M[0].length;
        int []f=new int[row+1];
        for(int i=1;i<=row;i++){
            f[i]=i;
        }
        for(int i=0;i<row;i++)
            for(int j=i;j<col;j++){
                if(M[i][j]==1&&i!=j){
                    merge(i+1,j+1,f);
                }
            }
        int sum=0;
        for(int i=1;i<=row;i++){
            if(f[i]==i){
                sum++;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] M = {{1, 1, 0}, {1, 1, 1}, {0, 1, 1}};
        System.out.println(findCircleNum(M));

    }
}
