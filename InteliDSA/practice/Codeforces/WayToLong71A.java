package Codeforces;

import java.util.Scanner;

public class WayToLong71A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        String str=sc.next();
//        int len=str.length();
        int n=sc.nextInt();
        while(n-->0) {
            String str=sc.next();
            int len=str.length();
            if (len > 10) {
                System.out.println(str.charAt(0) + "" + (len - 2) + str.charAt(len - 1));
            } else {
                System.out.println(str);
            }
        }
    }
}
