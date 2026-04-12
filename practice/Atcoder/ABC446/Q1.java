package Atcoder.ABC446;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringBuilder sb=new StringBuilder(sc.next());
        sb.insert(0,"Of");
        sb.setCharAt(2,(char)(sb.charAt(2)|' '));
        System.out.println(sb.toString());
    }
}
