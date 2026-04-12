package Graph.DFS;

import java.util.LinkedList;
import java.util.Queue;

public class RottingOranges {
    public static void main(String[] args) {
        int[][]arr={
                {2,1,1},
                {1,1,0},
                {0,1,1}
        };
        System.out.println(orangesRotting(arr));
    }
    static class Pair{
        int row;
        int col;
        int time;
        Pair(int row,int col,int time){
            this.row=row;
            this.col=col;
            this.time=time;
        }
    }
    public static int orangesRotting(int[][] grid) {
        int n=grid.length,m=grid[0].length;
        int[][]visited=new int[n][m];
        Queue<Pair> queue=new LinkedList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2){
                    queue.offer(new Pair(i,j,0));
                    visited[i][j]=2;
                }else visited[i][j]=0;
            }
        }
        int time=0;
        int[] allowedRow={0,-1,1,0};
        int[] allowedCol={-1,0,0,1};
        while(!queue.isEmpty()){
            int curRow=queue.peek().row;
            int curCol=queue.peek().col;
            int curTime=queue.peek().time;
            queue.remove();
            time=Math.max(time,curTime);
            for(int i=0;i<4;i++){
                int newRow=curRow+allowedRow[i];
                int newCol=curCol+allowedCol[i];
                if(newRow>=0&&newRow<n&&newCol>=0&&newCol<m&&grid[newRow][newCol]==1&&visited[newRow][newCol]==0){
                    queue.add(new Pair(newRow,newCol,time+1));
                    visited[newRow][newCol]=2;
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(visited[i][j]!=2&&grid[i][j]==1)return -1;
            }
        }
        return time;
    }
}
