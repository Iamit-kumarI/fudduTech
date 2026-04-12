package Atcoder.ABC431;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int h=sc.nextInt();
        int b=sc.nextInt();
        int result=Math.max(0,h-b);
        System.out.println(result);
    }
}
