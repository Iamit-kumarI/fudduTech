package Leetcode.String;

public class ContineousSegmentOf1 {
    public static void main(String[] args) {
        System.out.println(checkOnesSegment("110"));
    }
    public static boolean checkOnesSegment(String s) {
        boolean oneFound=false;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='1')oneFound=true;
            if(oneFound&&s.charAt(i)=='0')return false;
        }
        return true;
    }
}
