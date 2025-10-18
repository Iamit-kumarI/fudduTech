package DP.Memoization;

import java.util.Arrays;

public class Fibbonacci {
    public static void main(String[] args) {
        System.out.println(fibo(7));
    }
    //memoization arraylist+recursion
    /*
    public static int fibo(int n){
        ArrayList<Integer> list=new ArrayList<>(Collections.nCopies(n+1,-1));;
        return helper(n,list);
    }
    public static int helper(int n,ArrayList<Integer> dp){
        if(n<=1) return n;
        if(dp.get(n)!=-1)return dp.get(n);
        int val=helper(n-1,dp)+helper(n-2,dp);
        dp.set(n,val);
        return val;
    }
     */

    // memoization array+recursion
    public static int fibo(int n){
        int []arr=new int[n+1];
        Arrays.fill(arr,-1);
        return helper(n,arr);
    }
    public static int helper(int n,int []dp){
        if(n<=1)return n;
        if(dp[n]!=-1)return dp[n];
        return dp[n]=helper(n-1,dp)+helper(n-2,dp);
    }
}
// tc = O(n)
// sc = O(n)+O(n)