package Leetcode.Weekly.Weekly476;

public class Q2 {
    public int minLengthAfterRemovals(String s) {
        int counta=0,countb=0;
        String str=s;
        for(char c: s.toCharArray()){
            if(c=='a')counta++;
            else countb++;
        }
        return Math.abs(counta-countb);
    }
}
