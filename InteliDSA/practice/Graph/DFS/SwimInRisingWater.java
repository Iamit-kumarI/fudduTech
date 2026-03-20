package Graph.DFS;

import java.util.PriorityQueue;

public class SwimInRisingWater {
    public static void main(String[] args) {
        int[][]arr={
                {0,2},
                {1,3}
        };
        System.out.println(swimInWater(arr));
    }
    static class Pair{
        int row;
        int col;
        int val;
        int time;
        Pair(int row,int col,int val,int time){
            this.row=row;
            this.col=col;
            this.val =val;
            this.time=time;
        }
    }
    public static int swimInWater(int[][] grid) {
        int n=grid.length;
        int[][]visited=new int[n][n];
        return bfs(grid,visited,n,0,0);
    }
    public static int bfs(int[][]grid,int[][]visited,int n,int row,int col){
        PriorityQueue<Pair>pq=new PriorityQueue<>((a,b)->a.time -b.time);
        pq.offer(new Pair(0,0,grid[0][0],grid[0][0]));
        visited[0][0]=1;
        int[]allowedRow={0,-1,1,0};
        int[]allowedCol={-1,0,0,1};
        while(!pq.isEmpty()){
            Pair cur=pq.poll();
            for(int i=0;i<4;i++){
                int newRow=cur.row+allowedRow[i];
                int newCol=cur.col+allowedCol[i];
                if(newRow==n-1&&newCol==n-1)return cur.time;
                if(newRow>=0&&newRow<n&&newCol>=0&&newCol<n&&visited[newRow][newCol]==0){
                    int curTime=Math.max(cur.time,grid[newRow][newCol]);
                    pq.offer(new Pair(newRow,newCol,grid[newRow][newCol],curTime));
                    visited[newRow][newCol]=1;
                }
            }
        }
        return -1;
    }
}
