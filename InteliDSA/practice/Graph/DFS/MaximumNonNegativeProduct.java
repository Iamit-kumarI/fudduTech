package Graph.DFS;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaximumNonNegativeProduct {
    static int mod=(int)1e9+7;
    public static void main(String[] args) {
        int[][]arr={
                {1,-2,1},
                {1,-2,1},
                {3,-4,1}
        };
        System.out.println(maxProductPath(arr));
    }
    public static int maxProductPath(int[][] grid) {
        //use dfs
        int n=grid.length,m=grid[0].length;
        int[][]visited=new int[n][m];
        List<BigInteger>list=new ArrayList<>();
        dfs(grid,visited,0,0,n,m,list,BigInteger.valueOf(grid[0][0]));
        BigInteger max=null;
        for(BigInteger val:list)if(max==null||val.compareTo(max)>0)max=val;
        if(max==null||max.signum()<0)return -1;
        return max.mod(BigInteger.valueOf(mod)).intValue();
    }
    public static void dfs(int[][]grid, int[][]visited, int row, int col, int n, int m, List<BigInteger>list,BigInteger mul){
        if(row==n-1&&col==m-1){
            list.add(mul);
            return;
        }
        if(visited[row][col]!=0)return;
        visited[row][col]=1;
        int[]allowedRow={0,1};
        int[]allowedCol={1,0};
        for(int i=0;i<2;i++){
            int newRow=row+allowedRow[i];
            int newCol=col+allowedCol[i];
            if(newRow>=0&&newRow<n&&newCol>=0&&newCol<m){
                dfs(grid,visited,newRow,newCol,n,m,list,mul.multiply(BigInteger.valueOf(grid[newRow][newCol])));
//                visited[row][col]=0;
            }
        }
        visited[row][col]=0;
    }
}
