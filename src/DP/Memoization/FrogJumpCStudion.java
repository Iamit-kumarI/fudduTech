package DP.Memoization;
import java.lang.reflect.Array;
import java.util.*;
//this problem is on code studio and striver dp playlist lect 3
public class FrogJumpCStudion {
    public static void main(String[] args) {

    }
    public static int frogJump(int []arr){
        int[]dp=new int[arr.length];
        Arrays.fill(dp,-1);
        return helper(arr,0,dp);
    }
    public static int helper(int []arr,int index,int []dp){
        if(index==arr.length-1)return 0;
        if(dp[index]!=-1)return dp[index];
        int left=helper(arr,index+1,dp)+Math.abs(arr[index]-arr[index+1]);
        int right=0;
        if(index+2<arr.length){
            right=helper(arr,index+2,dp)+Math.abs(arr[index]-arr[index+2]);
        }
        return dp[index]=Math.min(left,right);
    }
}
