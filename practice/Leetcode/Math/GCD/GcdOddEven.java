package Leetcode.Math.GCD;

public class GcdOddEven {
    public static void main(String[] args) {
        System.out.println(gcdOfOddEvenSums(4));
    }
    public static int gcdOfOddEvenSums(int n) {
        int evenSum=n*(n+1);
        int oddSum=n*n;
        return gcd(evenSum,oddSum);
    }
    public static int gcd(int a,int b){
        if(b==0)return a;
        return gcd(b,a%b);
    }
}
