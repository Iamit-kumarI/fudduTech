package Graph.BFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class DetectCycleIn2dGrind {
    public static void main(String[] args) {
        char[][]arr={
                {'a','a','a','a'},
                {'a','b','b','a'},
                {'a','b','b','a'},
                {'a','a','a','a'}
        };
        System.out.println(containsCycle(arr));
    }
    static class Pair{
        int row;
        int col;
        int prow;
        int pcol;
        Pair(int row,int col,int prow,int pcol){
            this.row=row;
            this.col=col;
            this.prow=prow;
            this.pcol=pcol;
        }
    }
    public static boolean containsCycle(char[][] grid) {
        int n=grid.length,m=grid[0].length;
        boolean[][]visited=new boolean[n][m];
        int[]allowedRow={-1,0,1,0};
        int[]allowedCol={0,1,0,-1};
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(!visited[i][j]){
                    Queue<Pair>queue=new LinkedList<>();
                    queue.offer(new Pair(i,j,-1,-1));
                    visited[i][j]=true;
                    while(!queue.isEmpty()){
                        Pair cur=queue.poll();
                        for(int index=0;index<4;index++){
                            int newRow=cur.row+allowedRow[i];
                            int newCol=cur.col+allowedCol[i];
                            if(newRow>=0&&newRow<n&&newCol>=0&&newCol<m&&
                            grid[newRow][newCol]==grid[cur.row][cur.col]){
                                if(!visited[newRow][newCol]){
                                    visited[newRow][newCol]=true;
                                    queue.offer(new Pair(newRow,newCol,cur.row,cur.col));
                                }else if(newRow!=cur.prow&&newCol!=cur.pcol)return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
}
