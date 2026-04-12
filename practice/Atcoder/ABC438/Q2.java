package Atcoder.ABC438;

import java.util.Scanner;

public class Q2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        String s=sc.next();
        String t=sc.next();
        int ans=Integer.MAX_VALUE;
        for(int i=0;i+m<=n;i++){
            int cost=0;
            for(int j=0;j<m;j++){
                int sdigit=s.charAt(i+j)-'0';
                int tdigit=t.charAt(j)-'0';
                cost+=(sdigit-tdigit+10)%10;
            }
            ans=Math.min(ans,cost);
        }
        System.out.println(ans);
    }
}
