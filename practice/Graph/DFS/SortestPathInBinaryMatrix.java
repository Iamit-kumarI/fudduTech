package Graph.DFS;

public class SortestPathInBinaryMatrix {
    public static void main(String[] args) {
        int[][]arr={
                {0,0,0},
                {1,1,0},
                {1,1,0}
        };
        System.out.println(shortestPathBinaryMatrix(arr));
    }
    public static int shortestPathBinaryMatrix(int[][] grid) {
        int n=grid.length;
        if(grid[0][0]==1)return -1;
        boolean[][]visited=new boolean[n][n];
        int ans=dfs(grid,visited,n,n,0,0,1,Integer.MAX_VALUE);
        return ans==Integer.MAX_VALUE?-1:ans;
    }
    public static int dfs(int[][]grid, boolean[][]visited, int n, int m, int row, int col,int len,int curMin){
        if(row==n-1&&col==m-1){
            return Math.min(len,curMin);
        }
        visited[row][col]=true;
        int[]allowedRow={0,-1,1,-1,1,-1,0,1};
        int[]allowedCol={-1,-1,-1,0,0,1,1,1};
        for(int i=0;i<8;i++){
            int newRow=row+allowedRow[i];
            int newCol=col+allowedCol[i];
            if(newRow>=0&&newRow<n&&newCol>=0&&newCol<m&&grid[newRow][newCol]==0&&!visited[newRow][newCol]){
                curMin=Math.min(curMin,dfs(grid,visited,n,m,newRow,newCol,len+1,curMin));
            }
        }
        visited[row][col]=false;
        return curMin;
    }
}
