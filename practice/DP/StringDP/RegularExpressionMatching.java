package DP.StringDP;

import java.util.Arrays;

public class RegularExpressionMatching {
    public static void main(String[] args) {
        System.out.println(isMatch("aa","a*"));
    }
    public static boolean isMatch(String s, String p) {
        if(p.equals("*"))return true;
        boolean[][]arr=new boolean[s.length()][p.length()];
        for(boolean[]row:arr) Arrays.fill(row,false);
        return helper(s,p,s.length()-1,p.length()-1,arr);
    }
    public static boolean helper(String s,String p,int index1,int index2,boolean[][]dp){
        if(index1<0&&index2<0)return true;
        if(index1<0||index2<0)return false;
        if(dp[index1][index2])return dp[index1][index2];
        if(p.charAt(index2)=='.')dp[index1][index2]= helper(s,p,index1-1,index2-1,dp);
        if(p.charAt(index2)=='*'){
            //if * at 0 index
            if(index2==0)return true;
            //taking as nothing
            dp[index1][index2]= helper(s,p,index1,index2-1,dp);
            //taking as 1->n character
            index2--;
            while(index1>=0){
                if(index1==0&&index2!=0)return false;
                dp[index1][index2]=helper(s,p,index1-1,index2,dp);
            }
        }
        if(s.charAt(index1)==s.charAt(index2))dp[index1][index2]=helper(s,p,index1,index2,dp);
        return dp[index1][index2];
    }
}
