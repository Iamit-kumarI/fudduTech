package Leetcode.Weekly.Weekly476;

import java.util.Arrays;

public class Q3 {
    public long countDistinct(long n) {
        String str=Long.toString(n);
        int len=str.length();
        long [][][]dp=new long[len+1][2][2];
        for(long[][]arr:dp){
            for(long[]row:arr){
                Arrays.fill(row,-1);
            }
        }
        return solve(0,1,0,str,dp);
    }
    public static long solve(int index1, int index, int index3, String str, long[][][]dp){
        if(index1==str.length())return index3 ==1?1:0;
        if(dp[index1][index][index3]!=-1)return dp[index1][index][index3];
        long res=0;
        int tt=index==1?str.charAt(index1)-'0':9;
        for(int i=0;i<=tt;i++){
            if(i==0&& index3 ==0){
                res+=solve(index1+1,index==1&&i==tt?1:0,0,str,dp);
            }else if(i!=0){
                res+=solve(index1+1,index==1&&i==tt?1:0,1,str,dp);
            }
        }
        dp[index1][index][index3]=res;
        return res;
    }
}
