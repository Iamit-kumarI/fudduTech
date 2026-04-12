package DP.StringDP;

public class LongestPalindromicSubsequence {
    public static void main(String[] args) {
        String s="babad";
        System.out.println(longestPalindrome(s));
    }
    public static String longestPalindrome(String s) {
        if(s.isEmpty())return "";
        return helper(s,0,s.length()-1,new StringBuilder());
    }
    public static String helper(String s,int start,int end,StringBuilder sb){
        if(start>end)return "";
        if(s.charAt(start)==s.charAt(end)){
            sb.append(s.charAt(start));
            return helper(s,start++,end--,sb);
        }
        else helper(s,start++,end,sb);
        return helper(s,start,end--,sb);
    }
}
