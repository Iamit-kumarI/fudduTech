package Leetcode.BitManupulation;

public class POTD3370 {
    public static void main(String[] args) {
        System.out.println(smallestNumber(5));
    }
    public static int smallestNumber(int n) {
        int count=0;
        while(n>0){
            n=n>>1;
            count++;
        }
        return ((int)Math.pow(2,count))-1;
    }
    public int smallestNumbers(int n) {
        int count=0;
        while(n>0){
            n=n>>1;
            count++;
        }
        return ((int)Math.pow(2,count))-1;
    }
}
