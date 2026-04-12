package Atcoder.ABC430;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        if(c>=a&&d<b){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
