package Leetcode.BitManupulation;

public class ChangesToMakeAltBinaryString {
    public static void main(String[] args) {
        System.out.println(minOperations("0100"));
    }
    public static int minOperations(String s) {
        return Math.min(helper(s,'0'),helper(s,'1'));
    }
    public static int helper(String str,char expected){
        int count=0;
        for(int i=0;i<str.length();i++){
           if(str.charAt(i)==expected)count++;
           expected=expected=='0'?'1':'0';
        }
        return count;
    }
}
