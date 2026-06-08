package Leetcode.Math;

public class TotalWaivnessOfNumber {
    public static void main(String[] args) {
        System.out.println(totalWaviness(4848,4848));
    }
    public static int totalWaviness(int num1, int num2) {
        int count=0;
        while(num1<=num2){
            if(num1>999){
                
            }
            if(checkDigits(num1))count++;
            num1++;
        }
        return count;
    }
    public static boolean checkDigits(int num1){
        if(num1<100)return false;
        int lastDigit=num1%10;
        num1/=10;
        int midDigit=num1%10;
        num1/=10;
        int firstDigit=num1%10;
        if(lastDigit<midDigit&&firstDigit<midDigit)return true;
        if(lastDigit>midDigit&&firstDigit>midDigit)return true;
        return false;
    }
    public static int revDigit(int n){
        int val=0;
        while(n>0){
            val+=n%10;
            val*=10;
            n/=10;
        }
        return val/10;
    }

}
