package Atcoder.ABC451;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        if(s.length()%5==0) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
