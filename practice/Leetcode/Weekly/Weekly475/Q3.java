package Leetcode.Weekly.Weekly475;

import java.util.Arrays;

public class Q3 {
    public static void main(String[] args) {

    }
    public int maxPathScore(int[][] grid, int k) {
        int m=grid.length;
        int n=grid[0].length;
        int [][][]arr=new int[m][n][k+1];
        for(int [][]a:arr){
            for(int []b:a){
                Arrays.fill(b,-1);
            }
        }
        return helper(grid,k,arr,0,0,0);
    }
    public static int helper(int [][]grid,int k,int [][][]dp,int row,int col,int cost){
        int m=grid.length;
        int n=grid[0].length;
        if(row>=m||col>=n)return -1;
        int cell=grid[row][col];
        int ccost=(cell==0)?0:1;
        int total=cost+ccost;
        if(total>k)return -1;
        if(row==m-1&&col==n-1)return cell;
        if(dp[row][col][total]!=-1)return dp[row][col][total];
        int right=helper(grid,k,dp,row,col+1,total);
        int down=helper(grid,k,dp,row+1,col,total);
        int max=Math.max(right,down);
        dp[row][col][total]=(max==-1)?-1:max+cell;
        return dp[row][col][total];
    }
}