package DP.StringDP.LCSBased;

import java.util.Arrays;

public class InsertionToMakeStringPalindrome {
    public static void main(String[] args) {
        String s="zzazz";
        System.out.println(minInsertions(s));
    }
    public static int minInsertions(String s) {
        return s.length()-longestSubsequence(s,new StringBuilder(s).reverse().toString());
    }
    public static int longestSubsequence(String text1,String text2){
        int n=text1.length(),m=text2.length();
        int[][]arr=new int[n+1][m+1];
        for(int[]row:arr) Arrays.fill(row,-1);
        return helper(text1,text2,arr,text1.length()-1,text2.length()-1);
    }
    public static int helper(String text1,String text2,int[][]dp,int index1,int index2){
        if(index2<0||index1<0)return 0;
        if(dp[index1][index2]!=-1)return dp[index1][index2];
        if(text1.charAt(index1)==text2.charAt(index2))return dp[index1][index2]= 1+helper(text1,text2,dp,index1-1,index2-1);
        return dp[index1][index2]=Math.max(helper(text1,text2,dp,index1-1,index2),helper(text1, text2, dp, index1, index2-1));
    }
}
