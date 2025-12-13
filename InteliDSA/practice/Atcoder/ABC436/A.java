package Atcoder.ABC436;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s= sc.next();
        int len=n-s.length();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<len;i++)sb.append('o');
        sb.append(s);
        System.out.println(sb);
    }
}
