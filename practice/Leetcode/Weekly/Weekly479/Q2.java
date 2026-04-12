package Leetcode.Weekly.Weekly479;

public class Q2 {
    public static void main(String[] args) {
        System.out.println(largestPrime(20));
    }
    public static int largestPrime(int n) {
        int totalPrimeSum=0;
        int largest=0;
        for(int pNo=2;pNo<=n;pNo++){
            if(isPrime(pNo)){
                totalPrimeSum+=pNo;
                if(totalPrimeSum>n)break;
                if(isPrime(totalPrimeSum))largest=totalPrimeSum;
            }
        }
        return largest;
    }
    public static boolean isPrime(int num){
        if(num<=1)return false;
        if(num==2)return true;
        if(num%2==0)return false;
        for(int i=3;i*i<=num;i+=2){
            if(num%i==0)return false;
        }
        return true;
    }
}
