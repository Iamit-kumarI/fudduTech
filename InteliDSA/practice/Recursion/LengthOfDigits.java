package Recursion;

public class LengthOfDigits {
    public static void main(String[] args) {
        System.out.println(digitlen(8943));
    }
    public static int digitlen(int n){
        return helper(n,0);
    }
    public static int helper(int n,int len){
        if(n==0)return len;
        return helper(n/10,len+1);
    }
}
