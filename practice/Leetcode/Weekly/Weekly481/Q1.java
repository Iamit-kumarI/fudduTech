package Leetcode.Weekly.Weekly481;

public class Q1 {
    public int mirrorDistance(int n) {
        return Math.abs(n- reverseNo(n));
    }
    public int reverseNo(int n){
        int num=0;
        while(n>0){
            num=num*10+n%10;
            n/=10;
        }
        return num;
    }
}
