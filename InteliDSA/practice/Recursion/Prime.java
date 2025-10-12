package Recursion;

public class Prime {
    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            if(isPrime(i,2)) System.out.println(i);
        }
    }
    public static boolean isPrime(int num,int i){
        if(num<=2)return num==2;
        if(num%i==0)return false;
        if(i>Math.sqrt(num))return true;
        return isPrime(num,i+1);
    }
}
