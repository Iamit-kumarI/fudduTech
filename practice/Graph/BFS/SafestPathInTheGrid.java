package Graph.BFS;

import java.util.*;

public class SafestPathInTheGrid{
    public static void main(String[] args) {
        List<List<Integer>>list=new ArrayList<>();
        list.add(new ArrayList<>(List.of(0,0,1)));
        list.add(new ArrayList<>(List.of(0,0,0)));
        list.add(new ArrayList<>(List.of(0,0,0)));
        System.out.println(maximumSafenessFactor(list));
    }
    static class Pair{
        int row;
        int col;
        int safenessFactor;
        Pair(int row,int col,int safenessFactor){
            this.row=row;
            this.col=col;
            this.safenessFactor=safenessFactor;
        }
    }
    public static int maximumSafenessFactor(List<List<Integer>> grid) {
        int n=grid.size(),m=grid.getFirst().size(),max=Integer.MIN_VALUE;
        int[][]visited=new int[n][m];
        for(int[]row:visited)Arrays.fill(row,-1);
        Queue<Pair>queue=new LinkedList<>();
        queue.offer(new Pair(0,0,0));
        int[]allowedRow={0,0,1,-1};
        int[]allowedCol={1,-1,0,0};
        while(!queue.isEmpty()){
            Pair cur=queue.poll();
            if(cur.row==n-1&&cur.col==m-1)max=Math.max(cur.safenessFactor,max);
            for(int i=0;i<4;i++){
                int newRow=cur.row+allowedRow[i];
                int newCol=cur.col+allowedCol[i];
                int curSafenessFactor=cur.safenessFactor+(Math.abs(cur.row-newRow)+Math.abs(cur.col-newCol));
                if(newRow>=0&&newRow<n&&newCol>=0&&newCol<m&&newRow!=cur.row&&newCol!=cur.col&&visited[newRow][newCol]==-1){
                    queue.offer(new Pair(newRow,newCol,Math.max(cur.safenessFactor,curSafenessFactor)));
                    visited[newRow][newCol]=1;
                }
            }
            visited[cur.row][cur.col]=-1;
        }
        return max==Integer.MIN_VALUE?0:max;
    }
}
