package Atcoder.ABC438;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int d=sc.nextInt(),f=sc.nextInt();
        int s=d%7;
        System.out.println((((f-s)%7+7)%7)==0?7:(((f-s)%7+7)%7));
    }
}
