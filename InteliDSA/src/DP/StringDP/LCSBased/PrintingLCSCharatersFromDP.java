package DP.StringDP.LCSBased;

import java.util.Arrays;

public class PrintingLCSCharatersFromDP {
    public static void main(String[] args) {
        String test1="sea";
        String test2="eat";
        System.out.println(longestCommonSubsequence(test1,test2));
    }
    public static int longestCommonSubsequence(String text1, String text2) {
        int[][]arr=new int[text1.length()+1][text2.length()+1];
        for(int[]row:arr) Arrays.fill(row,-1);
        int lcs=helper(text1,text2,arr,text1.length()-1,text2.length()-1);
        System.out.println(printLc(text1,text2,arr));
        return lcs;
    }

    private static int helper(String text1, String text2, int[][] dp, int index1, int index2) {
        if(index1<0||index2<0)return 0;
        if(dp[index1][index2]!=-1)return dp[index1][index2];
        if(text1.charAt(index1)==text2.charAt(index2))return dp[index1][index2]=1+helper(text1,text2,dp,index1-1,index2-1);
        return dp[index1][index2]=Math.max(helper(text1,text2,dp,index1-1,index2),helper(text1,text2,dp,index1,index2-1));
    }
    public static String printLc(String text1,String text2,int[][]dp){
        StringBuilder sb=new StringBuilder();
        int i=text1.length()-1,j=text2.length()-1;
        while (i>=0&&j>=0){
            if(text1.charAt(i)==text2.charAt(j)){
                sb.append(text1.charAt(i));
                i--;
                j--;
            }else{
                int up=(i>0)?dp[i-1][j]:0;
                int left=(j>0)?dp[i][j-1]:0;
                if(up>left)i--;
                else j--;
            }
        }
        return sb.reverse().toString();
    }
}
