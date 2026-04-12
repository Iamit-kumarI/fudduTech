package Graph.BFS;

import java.util.LinkedList;
import java.util.Queue;

public class SortestPathInBinaryMatrix {
    public static void main(String[] args) {
        int[][]arr={
                {0,0,0},
                {1,1,0},
                {1,1,0}
        };
        System.out.println(shortestPathBinaryMatrix(arr));
    }
    static class Pair{
        int row;
        int col;
        int pathValue;
        Pair(int row,int col,int pathValue){
            this.row=row;
            this.col=col;
            this.pathValue=pathValue;
        }
    }
    public static int shortestPathBinaryMatrix(int[][] grid) {
        if(grid[0][0]==1)return -1;
        int n=grid.length,min=Integer.MAX_VALUE;
        Queue<Pair>queue=new LinkedList<>();
        queue.offer(new Pair(0,0,1));
        int[]allowedRow={0,-1,1,-1,1,-1,1,0};
        int[]allowedCol={-1,-1,-1,0,0,1,1,1};
        while(!queue.isEmpty()){
            Pair cur=queue.poll();
            if(cur.row==n-1&&cur.col==n-1)return cur.pathValue;
            for(int i=0;i<8;i++){
                int newRow=cur.row+allowedRow[i];
                int newCol=cur.col+allowedCol[i];
                if(newRow>=0&&newRow<n&&newCol>=0&&newCol<n&&grid[newRow][newCol]==0){
                    grid[newRow][newCol]=1;
                    queue.add(new Pair(newRow,newCol,cur.pathValue+1));
                }
            }
        }
        return min;
    }
}
