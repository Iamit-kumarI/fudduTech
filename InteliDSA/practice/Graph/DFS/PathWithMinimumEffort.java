package Graph.DFS;

import java.util.Arrays;

public class PathWithMinimumEffort {

    //mst problem need to solve first get the mst all concepts
    public static void main(String[] args) {
        int[][]arr={
                {1,2,2},
                {3,8,2},
                {5,3,5}
        };
        System.out.println(minimumEffortPath(arr));
    }
    public static int minimumEffortPath(int[][] heights) {
        int n=heights.length,m=heights[0].length;
        int[][]arr=new int[n][m];
        for(int[]row:arr) Arrays.fill(row,-1);
        return dfs(heights,arr,n,m,0,0,Integer.MAX_VALUE,0);
    }
    public static int dfs(int[][]heights,int[][]dp,int n,int m,int row,int col,int val,int curGap){
        if(row==n-1&&col==m-1){
            return curGap;
        }
        if(dp[row][col]!=-1)return dp[row][col];
        int[]allowedRow={0,-1,1,0};
        int[]allowedCol={-1,0,0,1};
        for(int i=0;i<4;i++){
            int newRow=row+allowedRow[i];
            int newCol=col+allowedCol[i];
            if(newRow>=0&&newRow<n&&newCol>=0&&newCol<m){
                curGap=Math.max(curGap,Math.abs(heights[row][col]-heights[newRow][newCol]));
                return dfs(heights,dp,n,m,newRow,newCol,val,curGap);
            }
        }
        dp[row][col]=curGap;
        return dp[row][col];
    }
}
