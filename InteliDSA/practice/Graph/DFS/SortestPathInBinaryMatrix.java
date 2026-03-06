//package Graph.DFS;
//
//public class SortestPathInBinaryMatrix {
//    public static void main(String[] args) {
//        int[][]arr={
//                {0,0,0},
//                {1,1,0},
//                {1,1,0}
//        };
//        System.out.println(shortestPathBinaryMatrix(arr));
//    }
//    public static int shortestPathBinaryMatrix(int[][] grid) {
//        int n=grid.length,m=grid[0].length;
//        int[]ans={Integer.MAX_VALUE};
//        boolean[][]visited=new boolean[n][m];
//        return dfs(grid,visited,n,m,0,0,arr,Integer.MAX_VALUE);
//    }
//    public static int dfs(int[][]grid, boolean[][]visited, int n, int m, int row, int col,int[]arr,int curMin){
//        if(row==n-1&&col==m-1){
//            arr[0]=Math.min(arr[0],curMin);
//        }
//        visited[row][col]=true;
//        int[]allowedRow={0,-1,1,-1,1,-1,0,1};
//        int[]allowedCol={-1,-1,-1,0,0,1,1,1};
//        for(int i=0;i<8;i++){
//            int newRow=row+allowedRow[i];
//            int newCol=col+allowedCol[i];
//            if(newRow>=0&&newRow<n&&newCol>=0&&newCol<m&&grid[newRow][newCol]==0){
//                return 1+ dfs(grid,visited,n,m,newRow,newCol,arr,curMin);//solve arr[0] mutation and currentMin value
//            }
//        }
//        visited[row][col]=false;
//        return 1;
//    }
//}
