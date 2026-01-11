package DP.StringDP;

import java.util.Arrays;

public class SuperSequence1092 {
    public static void main(String[] args) {
        String str1="abac";
        String str2="cab";
        System.out.println(shortestCommonSupersequence(str1,str2));
    }
    public static String shortestCommonSupersequence(String str1, String str2) {
        int[][]arr=new int[str1.length()][str2.length()];
        for(int[]row:arr) Arrays.fill(row,-1);
        int n=lcs(str1,str2,arr,str1.length()-1,str2.length()-1);
        int subsequenceLen=str1.length()+str2.length()-n;
        return printSuperSequence(str1,str2,arr);
    }
    public static int lcs(String text1,String text2,int[][]dp,int index1,int index2){
        if(index1<0||index2<0)return 0;
        if(dp[index1][index2]!=-1)return dp[index1][index2];
        if(text1.charAt(index1)==text2.charAt(index2))return dp[index1][index2]=1+lcs(text1,text2,dp,index1-1,index2-1);
        return dp[index1][index2]= Math.max(lcs(text1,text2,dp,index1-1,index2),lcs(text1,text2,dp,index1,index2-1));
    }
    public static String printSuperSequence(String text1,String text2,int[][]dp){
        StringBuilder sb=new StringBuilder();
        int i=text1.length()-1,j=text2.length()-1;
        while(i>=0&&j>=0){
            if(text1.charAt(i)==text2.charAt(j)){
                sb.append(text1.charAt(i));
                i--;
                j--;
            }
            else if(i>0&&dp[i-1][j]>=(j>0?dp[i][j-1]:0)){
                sb.append(text1.charAt(i));
                i--;
            }else{
                sb.append(text2.charAt(j-1));
                j--;
            }
        }
        while(i>=0)sb.append(text1.charAt(i--));
        while (j>=0)sb.append(text2.charAt(j--));
        return sb.reverse().toString();
    }
}
