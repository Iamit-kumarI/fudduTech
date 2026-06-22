package Leetcode.Recursion;

import java.util.Arrays;

public class MaxIceCreamBars {
    public static void main(String[] args) {
        int[]arr={1,3,2,4,1};
        System.out.println(maxIceCream(arr,7));
    }
    public static int maxIceCream(int[] costs, int coins){
        Arrays.sort(costs);
        int count=0;
        for(int val:costs){
            if(coins<val)break;
            coins-=val;
            if(coins>=0)count++;
        }
        return count;
//        int n=costs.length;
//        int[][]arr=new int[n][coins+1];
//        return helper(costs,coins,n-1,arr);
    }
    public static int helper(int[]arr,int target,int index,int[][]dp){
        if(index<0)return 0;
        if(dp[index][target]!=0)return dp[index][target];
        int take=0,nottake=0;
        nottake=helper(arr,target,index-1,dp);
        if(arr[index]<=target){
            take=helper(arr,target-arr[index],index-1,dp)+1;
        }
        return dp[index][target]=Math.max(take,nottake);
    }
}
