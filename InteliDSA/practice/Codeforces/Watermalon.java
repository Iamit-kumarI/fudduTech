//package Codeforces;

import java.util.Scanner;

public class Watermalon {
    public static void main(String[] args) {
        int val;
        Scanner sc=new Scanner(System.in);
        val=sc.nextInt();
        if(val%2==0&&val>2) {
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
