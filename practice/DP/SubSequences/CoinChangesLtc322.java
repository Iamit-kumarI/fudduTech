package DP.SubSequences;

import java.util.Arrays;

public class CoinChangesLtc322 {
    public static void main(String[] args) {
        int[]arr={1,2,5};
        System.out.println(coinChange(arr,11));
    }
    public static int coinChange(int[] coins, int amount) {
        int[][]arr=new int[coins.length+1][amount+1];
        for(int[]row:arr) Arrays.fill(row,-1);
        int ans=helper(coins,amount,arr,0);
        return ans==Integer.MAX_VALUE?-1:ans;
    }

    private static int helper(int[]coins,int target,int[][]dp,int index) {
        if(target==0)return 0;
        if(index==coins.length&&target!=0)return Integer.MAX_VALUE;
        if(dp[index][target]!=-1)return dp[index][target];
        int nottake=helper(coins,target,dp,index+1);
        int take=Integer.MAX_VALUE;
        if(coins[index]<=target){
            take=helper(coins,target-coins[index],dp,index);
            if(take!=Integer.MAX_VALUE){
                take+=1;
            }
        }
        dp[index][target]=Math.min(take,nottake);
        return dp[index][target];
    }
}
