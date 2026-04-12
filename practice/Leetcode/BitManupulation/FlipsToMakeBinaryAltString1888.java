package Leetcode.BitManupulation;

public class FlipsToMakeBinaryAltString1888 {
    public static void main(String[] args) {
        System.out.println(minFlips("111000"));
    }
    public static int minFlips(String s) {
        StringBuilder sb=new StringBuilder(s);
        if(s.length()>=4){
            if(s.charAt(0)=='1'&&s.charAt(1)=='1'&&s.charAt(s.length()-1)=='0'&&s.charAt(s.length()-2)=='0'){
                sb.deleteCharAt(0);
                sb.append("1");
            }
        }
        s=sb.toString();
        return Math.min(helper(s,'0'),helper(s,'1'));
    }
    public static int helper(String s,char expected){
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==expected)count++;
            expected=expected=='0'?'1':'0';
        }
        return count;
    }
}
