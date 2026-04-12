package Atcoder.ABC451;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[]cur=new int[n+1];
        int[]next=new int[m+1];
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            cur[a]++;
            next[b]++;
        }
        for(int i=1;i<=m;i++){
            System.out.println(next[i]-cur[i]);
        }
    }
}
