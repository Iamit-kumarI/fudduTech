package DP.StringDP.LCSBased;

import java.util.Arrays;

public class MinimumASCIIDeleteSumLtc712 {
    public static void main(String[] args) {
        String str1="delete";
        String str2="leet";
        System.out.println(minimumDeleteSum(str1,str2));
    }
    public static int minimumDeleteSum(String s1, String s2) {
        int[][]arr=new int[s1.length()][s2.length()];
        for(int[]row:arr)Arrays.fill(row,-1);
        int lcs=fillDpTable(s1,s2,arr,s1.length()-1,s2.length()-1);
        String lcsString=findMatchingString(s1,s2,arr);
        return helper(s1,s2,lcsString);
    }
    public static int fillDpTable(String text1,String text2,int[][]dp,int index1,int index2){
        if(index1<0||index2<0)return 0;
        if(dp[index1][index2]!=-1)return dp[index1][index2];
        if(text1.charAt(index1)==text2.charAt(index2))return dp[index1][index2]=1+fillDpTable(text1,text2,dp,index1-1,index2-1);
        return dp[index1][index2]=Math.min(fillDpTable(text1,text2,dp,index1-1,index2),fillDpTable(text1,text2,dp,index1,index2-1));
    }
    public static String findMatchingString(String text1,String text2,int[][]dp){
        StringBuilder sb=new StringBuilder();
        int i=text1.length()-1,j=text2.length()-1;
        while(i>=0&&j>=0){
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
    public static int helper(String str1,String str2,String match){
        int len=match.length();
        StringBuilder sb=new StringBuilder();
        int index=0;
        for(char c:str1.toCharArray()){
            if(index<len&&c==match.charAt(index))index++;
            else sb.append(c);
        }
        System.out.println(sb.toString());
        index=0;
        for(char c:str2.toCharArray()){
            if(index<len&&c==match.charAt(index))index++;
            else sb.append(c);
        }
        System.out.println(sb.toString());
        int ans=0;
        String pureString=sb.toString();
        for(char c:pureString.toCharArray())ans+=c;
        return ans;
    }
}
