//package Codeforces.R800;

import java.util.Scanner;

public class AmbitiousKid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int disFromZero=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            int cur=sc.nextInt();
            disFromZero=Math.min(disFromZero,Math.abs(cur));
        }
        System.out.println(disFromZero);
    }
}
