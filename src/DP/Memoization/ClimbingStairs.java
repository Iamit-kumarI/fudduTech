package DP.Memoization;

import java.util.ArrayList;
import java.util.Collections;

public class ClimbingStairs {
    public static void main(String[] args) {
        System.out.println(climbStairs(45));
    }
    public static int climbStairs(int n) {
        ArrayList<Integer> list=new ArrayList<>(Collections.nCopies(n+1,-1));
        return helper(n,list);
    }
    public static int helper(int n,ArrayList<Integer> dp){
        if(n<=2)return n;
        if(dp.get(n)!=-1)return dp.get(n);
        int val=helper(n-1,dp)+helper(n-2,dp);
        dp.set(n,val);
        return val;
    }
}
// debug it