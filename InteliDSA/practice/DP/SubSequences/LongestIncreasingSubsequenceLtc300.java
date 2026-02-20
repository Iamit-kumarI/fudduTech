package DP.SubSequences;

import java.util.Arrays;

public class LongestIncreasingSubsequenceLtc300 {
    public static void main(String[] args) {
        int[]arr={10,9,2,5,3,7,101,18};
        System.out.println(lengthOfLIS(arr));
    }
    public static int lengthOfLIS(int[] nums) {
        int[][]arr=new int[nums.length][nums.length+1];
        for(int[]row:arr) Arrays.fill(row,-1);
        return helper(0,-1,nums,arr);
    }
    public static int helper(int index,int prevIndex,int[]nums,int[][]dp){
        if(index==nums.length)return 0;
        if(dp[index][prevIndex+1]!=-1)return dp[index][prevIndex+1];
        int notTake=helper(index+1,prevIndex,nums,dp);
        int take=0;
        if(prevIndex==-1||nums[index]>nums[prevIndex]){
            take=1+helper(index+1,index,nums,dp);
        }
        dp[index][prevIndex+1]=Math.max(take,notTake);
        return dp[index][prevIndex+1];
    }
}
