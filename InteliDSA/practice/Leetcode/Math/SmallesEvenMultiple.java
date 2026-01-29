package Leetcode.Math;

public class SmallesEvenMultiple {
    public static void main(String[] args) {
        System.out.println(smallestEvenMultiple(5));
    }
    public static int smallestEvenMultiple(int n) {
        if((n&1)==0) return n;
        return n*2;
    }
}
