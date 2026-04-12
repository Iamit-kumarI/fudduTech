package Leetcode.BitManupulation;

public class KthBitInNthBinaryStringLtc1545 {
    public static void main(String[] args) {
        System.out.println(findKthBit(3,1));
    }
    public static char findKthBit(int n, int k) {
        //s(i-1)+1+rev(inve(si-1);
        StringBuilder sb=new StringBuilder("0");
        while(n-->0){
            sb=new StringBuilder(sb+"1"+rev(inverted(sb)));
        }
        return sb.charAt(k-1);
    }
    public static StringBuilder rev(StringBuilder sb){
        return sb.reverse();
    }
    public static StringBuilder inverted(StringBuilder sb){
        for(int i=0;i<sb.length();i++)sb.setCharAt(i,(char)(sb.charAt(i)^1));
        return sb;
    }
}
