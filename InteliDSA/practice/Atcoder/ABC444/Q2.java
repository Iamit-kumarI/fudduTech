package Atcoder.ABC444;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int count=0;
        for(int i=1;i<=n;i++){
            if(digitSum(i)==k)count++;
        }
        System.out.println(count);
    }
    public static int digitSum(int n){
        int sum=0;
        while(n>0){
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
}
