package Leetcode.BitManupulation;

import java.util.Arrays;

public class PrimeNoOfSetBitsLtc762 {
    public static void main(String[] args) {
        long starttime=System.currentTimeMillis();
        System.out.println(countPrimeSetBits(10,15));
        System.out.println(System.currentTimeMillis()-starttime);
    }
    public static int countPrimeSetBits(int left, int right) {
        int count=0;
        while (left<=right){
            if(isPrime(Integer.bitCount(left++)))count++;
        }
        return count;
    }
    public static boolean isPrime(int n){
        if(n<=1)return false;
        if(n==2)return true;
        if(n%2==0)return false;
        for(int i=3;i*i<=n;i++){
            if(n%i==0)return false;
        }
        return true;
    }
}
