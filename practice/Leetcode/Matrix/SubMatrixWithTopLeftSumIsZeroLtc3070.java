package Leetcode.Matrix;

public class SubMatrixWithTopLeftSumIsZeroLtc3070 {
    public static void main(String[] args) {
        int [][]arr={
                {7,7,10,9},
                {10,5,10,3}
        };
        System.out.println(countSubmatrices(arr,54));
    }
    public static int countSubmatrices(int[][] grid, int k) {
        //trying dfs
        int n=grid.length,m=grid[0].length;
        int[][]sumMatrix=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(sumMatrix[i][j]==0)sumMatrix[i][j]=dfsSum(grid,i,j,sumMatrix,0);
            }
        }

        return sumInMatrix(grid,k);
    }
    public static int dfsSum(int[][]grid,int row,int col,int[][]dp,int sum){
        if(row==0&&col==0)return sum+grid[0][0];
        if(dp[row][col]!=0)return dp[row][col]+sum;
        return 1;
    }
    public static int sumInMatrix(int[][]grid,int k){
        int n=grid.length,m=grid[0].length;
        for(int i=1;i<m;i++){
            grid[0][i]+=grid[0][i-1];
        }
        for(int i=1;i<n;i++){
            grid[i][0]+=grid[i-1][0];
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i==0||j==0)continue;
                else grid[i][j]+=grid[i-1][j]+grid[i][j-1]-grid[i-1][j-1];
            }
        }
        int ans=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]<k)ans++;
            }
        }
        return ans;
    }
}
