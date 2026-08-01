package Leetcode.Array;

public class PredictTheWinner {
    public static void main(String[] args) {
        int[]arr={1,5,233,7};
        System.out.println(predictTheWinner(arr));
    }
    public static boolean predictTheWinner(int[] nums) {
        Integer[][]arr=new Integer[nums.length][nums.length];
        return helper(nums,0,nums.length-1,arr)>=0;
    }
    public static int helper(int[]arr,int start,int end,Integer[][]dp){
        if(start==end)return arr[start];
        if(dp[start][end]!=null)return dp[start][end];
        int takeStart=arr[start]-helper(arr,start+1,end,dp);
        int takeEnd=arr[end]-helper(arr,start,end-1,dp);
        return dp[start][end]=Math.max(takeStart,takeEnd);
    }
}
