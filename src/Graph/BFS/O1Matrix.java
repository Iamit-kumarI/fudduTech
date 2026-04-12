package Graph.BFS;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class O1Matrix {
    public static void main(String[] args) {
        int[][]arr={
                {0,0,0},
                {0,1,0},
                {1,1,1}
        };
        arr=updateMatrix(arr);
        for(int[]row:arr){
            System.out.println(Arrays.toString(row));
        }
    }
    static class Node{
        int row;
        int col;
        int distance;
        Node(int row,int col,int distance){
            this.row=row;
            this.col=col;
            this.distance=distance;
        }
    }
    public static int[][] updateMatrix(int[][] mat) {
        int n=mat.length,m=mat[0].length;
        int[][]visited=Arrays.copyOf(mat,mat.length);
        int[][]distance=new int[n][m];
        Queue<Node>queue=new LinkedList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==0){
                    queue.add(new Node(i,j,0));
                }
            }
        }
        int[]allowedRow={-1,0,1,0};
        int[]allowedCol={0,1,0,-1};
        while(!queue.isEmpty()){
            int row=queue.peek().row;
            int col=queue.peek().col;
            int steps=queue.peek().distance;
            queue.remove();
            distance[row][col]=steps;
            for(int i=0;i<4;i++){
                int newRow=row+allowedRow[i];
                int newCol=col+allowedCol[i];
                if(newRow>=0&&newRow<n&&newCol>=0&&newCol<m&&
                        visited[newRow][newCol]==1){
                    visited[newRow][newCol]=0;
                    queue.add(new Node(newRow,newCol,steps+1));
                }
            }
        }
        return distance;
    }
}
