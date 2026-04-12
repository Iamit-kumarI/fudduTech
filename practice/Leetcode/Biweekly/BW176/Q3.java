package Leetcode.Biweekly.BW176;

import java.util.Arrays;

public class Q3 {
    public static void main(String[] args) {
        int[]words={1,4,3,5};
        int[]nums={1,1,2,2};
        System.out.println(rob(words,nums));
    }
    public static long rob(int[] nums, int[] colors) {
        long[]arr=new long[nums.length];
        Arrays.fill(arr,-1);
        return helper(nums,colors,arr,nums.length-1);
    }
    public static long helper(int[]nums,int[]colors,long[]dp,int index){
        if(index<0)return 0L;
        if(index==0)return nums[0];
        if(dp[index]!=-1)return dp[index];
        long dontTake=helper(nums,colors,dp,index-1);
        long take;
        if(colors[index]==colors[index-1])take=nums[index]+helper(nums,colors,dp,index-2);
        else take=nums[index]+helper(nums,colors,dp,index-1);
        dp[index]=(long)Math.max(dontTake,take);
        return dp[index];
//        int n=nums.length;
//        if(n==0)return 0;
//        if(n==1)return nums[1];
//        long[]dp=new long[n];
//        long[][]tx=new long[n][2];
//        for(int i=0;i<2;i++){
//            tx[i][0]=nums[i];
//            tx[i][1]=colors[i];
//        }
//        dp[0]=nums[0];
//        if(colors[1]==colors[0]){
//            dp[1]=Math.max(nums[0],nums[1]);
//        }else{
//            dp[1]=nums[0]+nums[1];
//        }
//        for(int i=2;i<n;i++){
//            long donttake=dp[n-1];
//            long take;
//            if(colors[i]==colors[i-1]){
//                take=nums[i]+dp[i-2];
//            }else{
//                take=nums[i]+dp[i-1];
//            }
//            dp[i]=Math.max(donttake,take);
//        }
//        return dp[n-1];
    }
}
