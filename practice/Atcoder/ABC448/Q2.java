package Atcoder.ABC448;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        long[]c=new long[m+1];
        long[]need=new long[m+1];
        for(int i=1;i<=m;i++)c[i]=sc.nextLong();
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            long b=sc.nextLong();
            need[a]+=b;
        }
        long ans=0;
        for(int i=1;i<=m;i++){
            ans+=Math.min(c[i],need[i]);
        }
        System.out.println(ans);
    }
}
