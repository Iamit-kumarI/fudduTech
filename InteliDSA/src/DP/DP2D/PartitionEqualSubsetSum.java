package DP.DP2D;
import java.util.Arrays;
public class PartitionEqualSubsetSum {
    public static void main(String[] args) {
        int[]arr={1,5,11,5};
        System.out.println(canPartition(arr));
    }
    public static boolean canPartition(int[] nums) {
        int target=0,n=nums.length;
        for(int val:nums)target+=val;
        if(target%2!=0)return false;
        int[][]dp=new int[n][target+1];
        for(int []row:dp){
            Arrays.fill(row,-1);
        }
        return helper(nums,n-1,target/2,dp);
    }
    public static boolean helper(int []arr,int index,int target,int [][]dp){
        if(target==0)return true;
        if(index==0)return arr[0]==target;
        if(dp[index][target]!=-1)return dp[index][target]==1;
        boolean take=false;
        if(arr[index]<=target)take=helper(arr,index-1,target-arr[index],dp);
        boolean notTake=helper(arr,index-1,target,dp);
        dp[index][target]=(notTake||take)?1:0;
        return notTake||take;
    }
}