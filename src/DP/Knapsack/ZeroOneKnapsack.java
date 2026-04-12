package DP.Knapsack;

import java.util.Arrays;

public class ZeroOneKnapsack {
    public static void main(String[] args) {
        int[]arr={1,2,3};
        int[]arr2={4,5,1};
        System.out.println(knapsack(4,arr,arr2));
    }
    public static int knapsack(int W, int []val, int []wt) {
        int[][]arr=new int[wt.length][W+1];
        for(int []row:arr){
            Arrays.fill(row,-1);
        }
        return helper(W,val,wt,arr,0);
    }

    private static int helper(int weight,int[]value,int []wt,int [][]dp,int index) {
        if(index>=value.length||weight==0)return 0;
        if(dp[index][weight]!=-1)return dp[index][weight];
        int notTake=helper(weight,value,wt,dp,index+1);
        int take=0;
        if(wt[index]<=weight){
            take=value[index]+helper(weight-wt[index],value,wt,dp,index+1);
        }
        return dp[index][weight]=Math.max(take,notTake);
    }
}
