package Atcoder.ABC429;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int min=Math.min(n,m);
        int len=n-m;
        while(min-->0) System.out.println("OK");
        if(len>0){
            while(len-->0) System.out.println("Too Many Requests");
        }
    }
}
