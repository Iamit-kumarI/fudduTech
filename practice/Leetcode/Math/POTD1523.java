package Leetcode.Math;

public class POTD1523 {
    public static void main(String[] args) {
        System.out.println(countOdds(8,10));
    }
    public static int countOdds(int low, int high) {
        if(low%2!=0&&high%2!=0)return (high-low)/2+1;
        if(low%2!=0||high%2!=0)return high-low;
        return (high-low)/2;
    }
}
