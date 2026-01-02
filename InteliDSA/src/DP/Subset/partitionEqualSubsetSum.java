package DP.Subset;

import java.util.Arrays;
public class partitionEqualSubsetSum {
    public int minimumDifference(int[] nums) {
        int n=nums.length,totalsum=0;
        for(int val:nums)totalsum+=val;
        boolean[][]arr=new boolean[n][totalsum+1];
        for(int i=0;i<=totalsum;i++){
            subSetSum(n-1,i,nums,arr);
        }
        int min=Integer.MAX_VALUE;
        for(int s1=0;s1<=totalsum;s1++){
            if(arr[n-1][s1]){
                int s2=totalsum-s1;
                min=Math.min(min,Math.abs(s1-s2));
            }
        }
        return min;
    }

    private boolean subSetSum(int index,int target,int[] nums, boolean[][] dp) {
        if(target==0)return dp[index][target]=true;
        if(index==0)return dp[index][target]=(nums[0]==target);
        if(dp[index][target])return dp[index][target];
        boolean nottake=subSetSum(index-1,target,nums,dp);
        boolean take=false;
        if(nums[index]<=target)take=subSetSum(index-1,target-nums[index],nums,dp);
        return dp[index][target]=take||nottake;
    }
}