//package DP.Subset;
//
//import java.util.Arrays;
//public class partitionEqualSubsetSum {
//    public int minimumDifference(int[] nums) {
//        int sum=0,n=nums.length;
//        for(int val:nums)sum+=val;
//        boolean[][]dp=new boolean[n][sum+1];
//        for(int i=0;i<n;i++)dp[i][0]=true;
//        if(nums[0]<=sum)dp[0][nums[0]]=true;
//        for(int index=1;index<n;index++){
//            for(int taget=1;taget<=sum;taget++){
//                boolean nottake=dp[index-1][taget];
//                boolean take=false;
//                if(nums[index]<=taget){
//                    take=dp[index-1][taget-nums[index]];
//                }
//                dp[index][taget]=take||nottake;
//            }
//        }
//        int min=Integer.MAX_VALUE;
//        for(int s1=0;s1<=sum/2;s1++){
//            if(dp[n-1][s1])min=Math.min(min,Math.abs(sum-2*s1);
//        }
//        return min;
//    }
//}