package Leetcode.Recursion.SubSeq;

public class TDay43P2 {
    public static int[] gcd(int a, int b) {
        if(b==0)return new int[]{a,1,0};
        int[]arr=gcd(b,a%b);
        int gcd=arr[0];
        int newa=arr[1];
        int newb=arr[2];
        int b1=newa-(a/b)*newb;
        return new int[]{gcd,newb,b1};
    }
}
