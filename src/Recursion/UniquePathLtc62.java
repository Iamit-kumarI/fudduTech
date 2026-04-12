package Recursion;

import java.util.Arrays;

public class UniquePathLtc62 {
    public static void main(String[] args) {
        System.out.println(uniquePaths(3,7));
    }
    public static int uniquePaths(int m, int n) {
        int [][]arr=new int[m][n];
        for(int i=0;i<m;i++)Arrays.fill(arr[i],-1);
        return helper(m-1,n-1,0,0,arr);
    }
    public static int helper(int m,int n,int row,int col,int [][]dp){
        //base case \\ reached finish
        if(row==m&&col==n)return 1;
        // if get out of the boundry
        if(row>m||col>n)return 0;
        // if already calculate
        if(dp[row][col]!=-1)return dp[row][col];
        int right=helper(m,n,row,col+1,dp);
        int down=helper(m,n,row+1,col,dp);
        return dp[row][col]=right+down;
    }
}
