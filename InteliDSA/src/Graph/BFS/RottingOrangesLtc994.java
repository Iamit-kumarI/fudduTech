package Graph.BFS;

import java.util.LinkedList;
import java.util.Queue;

public class RottingOrangesLtc994 {

    class pair{
        int row;
        int col;
        int time;
        pair(int row,int col,int time){
            this.row=row;
            this.col=col;
            this.time=time;
        }
    }

    public int orangesRotting(int[][] grid) {
        int n=grid.length,m=grid[0].length;
        Queue<pair> queue=new LinkedList<>();
        int[][]visited=new int[n][m];
        int freshCount=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2) {
                    queue.add(new pair(i,j,0));
                    visited[i][j]=2;
                }else visited[i][j]=0;
                if(grid[i][j]==1)freshCount++;
            }
        }
        int time=0;
        int[]drow={-1,0,1,0};
        int[]dcol={0,1,0,-1};
        int count=0;
        while (!queue.isEmpty()){
            int curRow=queue.peek().row;
            int curCol=queue.peek().col;
            int curTime=queue.peek().time;
            time=Math.max(curTime,time);
            queue.remove();
            for(int i=0;i<4;i++){
                int nrow=curRow+drow[i];
                int ncol=curCol+dcol[i];
                if(nrow>=0&&nrow<n&&ncol>=0&&ncol<m&&visited[nrow][ncol]==0&&grid[nrow][ncol]==1){
                    queue.add(new pair(nrow,ncol,time+1));
                    visited[nrow][ncol]=2;
                    count++;
                }
            }
        }
        return count!=freshCount?-1:time;
    }
}
