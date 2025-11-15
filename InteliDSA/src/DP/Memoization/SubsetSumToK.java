package DP.Memoization;

import java.util.Arrays;

public class SubsetSumToK {
    public static boolean subsetSumToK(int n, int k, int[] arr){
        int [][]dp=new int[n][k+1];
        for(int[]row:dp){
            Arrays.fill(row,-1);
        }
        return helper(k,arr,n-1,dp);
    }
    public static boolean helper(int target,int []arr,int index,int [][]dp){
        if(target==0)return true;
        if(index==0)return arr[0]==target;
        if(dp[index][target]!=-1)return dp[index][target]==0?false:true;
        boolean take=false;
        if(arr[index]<=target) take=helper(target-arr[index],arr,index-1,dp);
        boolean nottake= helper(target,arr,index-1,dp);
        dp[index][target]=nottake||take?1:0;
        return nottake||take;
    }
}
