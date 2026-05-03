package Graph.DFS;

import java.util.LinkedList;
import java.util.Queue;

public class MinimumPathWithoutExceddingKPOTD3742 {
    public static void main(String[] args) {
        int[][]arr={
                {0, 1},
                {2,0}
        };
        System.out.println(maxPathScore(arr,1));
    }
    static class Pair{
        int steps,row,col;
        Pair(int steps,int row,int col){
            this.steps=steps;
            this.row=row;
            this.col=col;
        }
    }
    public static int maxPathScore(int[][] grid, int k) {
        if(grid[0][0]>k)return -1;
        int ans=Integer.MAX_VALUE,n=grid.length,m=grid[0].length;
        boolean[][]visited=new boolean[n][m];
        Queue<Pair>queue=new LinkedList<>();
        queue.add(new Pair(0,0,0));
        while(!queue.isEmpty()){
            Pair cur=queue.poll();
            int[]allowedRow={1,0};
            int[]allowedCol={0,1};
            for(int i=0;i<2;i++){
                int newRow=cur.row+allowedRow[i];
                int newCol=cur.col+allowedCol[i];
                if(isValid(newRow,newCol,grid,n,m,k)&&!visited[newRow][newCol]){
                    visited[newRow][newCol]=true;
                    queue.add(new Pair(cur.steps+1,newRow,newCol));
                    if(newRow==n-1&&newCol==m-1){
                        ans=Math.min(ans,cur.steps+1);
                    }
                }
            }
        }
        return ans==Integer.MAX_VALUE?-1:ans;
    }
    public static boolean isValid(int row,int col,int[][]grid,int n,int m,int k){
        return row>=0&&row<n&&col>=0&&col<m&&grid[row][col]<=k;
    }
}
