package Graph.DFS;

import java.util.LinkedList;
import java.util.Queue;

public class RottenOranges {
    //practice
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
        Pair(int left,int right,int time){
            this.row =left;
            this.col =right;
            this.time=time;
        }
    }
    public static int orangesRotting(int[][] grid) {
        int n=grid.length,m=grid[0].length;
        Queue<Pair>queue=new LinkedList<>();
        int[][]visited=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2){
                    queue.offer(new Pair(i, j, 0));
                    visited[i][j]=2;
                }
            }
        }
        int time=0;
        int[]allowedRow={0,-1,1,0};
        int[]allowedCol={-1,0,0,1};
        while(!queue.isEmpty()){
            int curRow=queue.peek().row;
            int curCol=queue.peek().col;
            int curtime=queue.peek().time;
            queue.remove();
            time=Math.max(time,curtime);
            for(int i=0;i<4;i++){
                int newRow=curRow+allowedRow[i];
                int newCol=curCol+allowedCol[i];
                if(newRow>=0&&newRow<n&&newCol>=0&&newCol<m&&visited[newRow][newCol]==0&&grid[newRow][newCol]==1){
                    queue.offer(new Pair(newRow,newCol,time+1));
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
