package Leetcode.Weekly.Weekly477;

public class Q1 {
    public static void main(String[] args) {
        System.out.println(sumAndMultiply(1000));
    }
    public static long sumAndMultiply(int n) {
        long sum=0,ans=0,mul=1;
        while(n>0){
            int r=n%10;
            sum+=r;
            if(r!=0) {
                ans+=r*mul;
                mul=mul*10;
            }
            n/=10;
        }
        return ans*sum;
    }
}
