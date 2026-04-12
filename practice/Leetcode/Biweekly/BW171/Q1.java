package Leetcode.Biweekly.BW171;

public class Q1 {
    public static void main(String[] args) {
        System.out.println(completePrime(39));
    }
    public static boolean completePrime(int num) {
        String str=String.valueOf(num);
        int len=str.length();
        for(int i=1;i<=len;i++){
            int pre=Integer.parseInt(str.substring(0,i));
            if(!isPrime(pre))return false;
        }
        for(int i=0;i<len;i++){
            int suffix=Integer.parseInt(str.substring(i));
            if(!isPrime(suffix))return false;
        }
        return true;
    }
    public static boolean isPrime(int n){
        if(n<=1)return false;
        if(n==2)return true;
        if(n%2==0)return false;
        for(int i=3;i*i<=n;i+=2){
            if(n%i==0)return false;
        }
        return true;
    }
}
