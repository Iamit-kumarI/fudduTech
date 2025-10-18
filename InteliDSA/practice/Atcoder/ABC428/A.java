package Atcoder.ABC428;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        int x=sc.nextInt();
        int time=a+b;
        int fulltime=x/time;
        int remtime=x%time;
        int travel=fulltime*s*a;
        travel+=s*Math.min(remtime,a);
        System.out.println(travel);
    }
}
