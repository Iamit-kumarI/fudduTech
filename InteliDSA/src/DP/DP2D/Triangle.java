package DP.DP2D;

import java.util.Arrays;
import java.util.List;

public class Triangle {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n=triangle.size();
        int [][]arr=new int[n][n];
        for(int []rowarr:arr){
            Arrays.fill(rowarr,-1);
        }
        return helper(0,0,triangle,n,arr);
    }
    public int helper(int row, int col, List<List<Integer>> triangle, int len, int [][]dp){
        if(dp[row][col]!=-1)return dp[row][col];
        if(row==len-1)return triangle.get(row).get(col);
        int down=triangle.get(row).get(col)+helper(row+1,col,triangle,len,dp);
        int right=triangle.get(row).get(col)+helper(row+1,col+1,triangle,len,dp);
        return dp[row][col]=Math.min(down,right);
    }
}