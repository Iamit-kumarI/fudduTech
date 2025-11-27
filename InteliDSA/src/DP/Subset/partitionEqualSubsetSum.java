//package DP.Subset;
//
//import java.util.Arrays;
//
////problem: https://www.naukri.com/code360/problems/partition-equal-subset-sum-_892980
//public class partitionEqualSubsetSum {
//    public static boolean canPartition(int[] arr, int n) {
//        // Write your code here.
//        int totalSum=0;
//        for(int val:arr)totalSum+=val;
//        if(totalSum%2!=0)return false;
//        return sumToK(arr,n,totalSum/2);
//    }
//    public static boolean sumToK(int []arr,int n,int target){
//        int[][]dp=new int[n][target+1];
//        for(int []row:dp){
//            Arrays.fill(row,-1);
//        }
//        return helper(arr,n,target,dp);
//    }
//    public static boolean helper(int []arr,int index,int target,int [][]dp){
//        if(target==0)return true;
//        if(index==0)return arr[0]==target;
//        if(dp[index][target]!=-1)return dp[index][target]==0;
//        boolean take=false;
//        if(arr[index]<=target)take=helper(arr,index-1,target-arr[i],dp);
//        boolean notTake=helper(arr,index-1,target,dp);
//        dp[index][target]=notTake||take;
//        return notTake||take;
//    }
//}