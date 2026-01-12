package DP.StringDP.LCSBased;

import java.util.Arrays;

public class Str1ToStr2 {
    public static void main(String[] args) {
        String str1="leetcode";
        String str2="etco";
        System.out.println(minDistance(str1,str2));
    }
    public static int minDistance(String word1, String word2) {
        return word1.length()+word2.length()-2*longestCommonSubsequence(word1,word2);
    }
    public static int longestCommonSubsequence(String text1,String text2){
        int[][]arr=new int[text1.length()+1][text2.length()+1];
        for(int[]row:arr) Arrays.fill(row,-1);
        return helper(text1,text2,arr,text1.length()-1,text2.length()-1);
    }
    public static int helper(String text1,String text2,int[][]dp,int index1,int index2){
        if(index1<0||index2<0)return 0;
        if(dp[index1][index2]!=-1)return dp[index1][index2];
        if(text1.charAt(index1)==text2.charAt(index2))return dp[index1][index2]=1+helper(text1,text2,dp,index1-1,index2-1);
        return dp[index1][index2]=Math.max(helper(text1,text2,dp,index1-1,index2),helper(text1,text2,dp,index1,index2-1));
    }
}
