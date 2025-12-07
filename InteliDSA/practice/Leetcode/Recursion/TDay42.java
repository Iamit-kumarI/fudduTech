package Leetcode.Recursion;

public class TDay42 {
    public static void main(String[] args) {
        System.out.println(reverseString("Geeks"));
    }
    public static String reverseString(String s) {
        StringBuilder sb=new StringBuilder();
        return helper(s,sb,s.length()-1);
    }
    public static String helper(String s,StringBuilder sb,int index){
        if(index<0)return sb.toString();
        return helper(s,sb.append(s.charAt(index)),index-1);
    }
}
