package DP.SubSequences;

import java.util.Arrays;

public class TargetSumLtc494 {
    public static void main(String[] args) {
        int[]arr={1,1,1,1,1};
        System.out.println(findTargetSumWays(arr,3));
    }
    public static int findTargetSumWays(int[] nums, int target) {
        int[][]arr=new int[nums.length+1][target+1];
        for(int[]row:arr) Arrays.fill(row,-1);
        return helper(nums,0,arr,0,target);
    }

    private static int helper(int[] nums, int cur, int[][] dp, int index,int target) {
        if(cur==target)return 1;
        if(index==nums.length&&target>0)return 0;
        if(dp[index][cur]!=-1)return dp[index][cur];
        int positive=helper(nums,cur+nums[index],dp,index+1,target);
        int negative=0;
        if(nums[index]<=cur){
            negative=helper(nums,cur-nums[index],dp,index+1,target);
        }
        dp[index][cur]=negative+positive;
        return dp[index][cur];
    }
}
