package Atcoder.ABC446;

import java.util.Arrays;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n==1){
            System.out.println(1);
            return;
        }
        int[]arr=new int[n];
        for(int i=0;i<n;i++)arr[i]=sc.nextInt();
        int[]dp=new int[n];
        Arrays.fill(dp,-1);
        System.out.println(helper(arr,1,dp));
    }
    public static int helper(int[]arr,int index,int []dp){
        if(index==arr.length)return 0;
        if(dp[index]!=-1)return dp[index];
        if(arr[index]==arr[index-1]+1){
            int donetake=helper(arr,index+1,dp);
            int take= 1+helper(arr,index+1,dp);
            dp[index]=Math.max(donetake,take);
        }
        dp[index]= helper(arr,index+1,dp);
        return dp[index];
    }
}
