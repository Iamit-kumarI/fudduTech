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
        boolean[][]arr=new boolean[n][m];
        int[]ans={Integer.MAX_VALUE};
        int[][]dp=new int[n][m];
        for(int[]row:dp)Arrays.fill(row,-1);
        dfs(heights,arr,n,m,0,0,0,ans,dp);
        return ans[0];
    }
    public static void dfs(int[][]heights,boolean[][]visited,int n,int m,int row,int col,int curMax,int[]ans,int[][]dp){
        if(row==n-1&&col==m-1){
            ans[0]=Math.min(ans[0],curMax);
            return;
        }
        if(dp[row][col]!=-1){
            curMax=dp[row][col];
        }
        visited[row][col]=true;
        int[]allowedRow={0,-1,1,0};
        int[]allowedCol={-1,0,0,1};
        for(int i=0;i<4;i++){
            int newRow=row+allowedRow[i];
            int newCol=col+allowedCol[i];
            if(newRow>=0&&newRow<n&&newCol>=0&&newCol<m&&!visited[newRow][newCol]){
                int diff=Math.abs(heights[row][col]-heights[newRow][newCol]);
                int newMax=Math.max(curMax,diff);
                dfs(heights,visited,n,m,newRow,newCol,newMax,ans,dp);
                dp[row][col]=ans[0];
            }
        }
        visited[row][col]=false;
    }
}
