package Atcoder.ABC430;

import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),a=sc.nextInt(),b=sc.nextInt();
        String s=sc.next();
        int ra=0,rb=0,ca=0,cb=0;
        long ans=0L;
        for(int i=0;i<n;i++){
            while(ra<n&&ca<a){
                if(s.charAt(ra)=='a')ca++;
                ra++;
            }
            while(rb<n&&cb<b){
                if(s.charAt(rb)=='a')cb++;
                rb++;
            }
            if(ca>=a&&cb>=b){
                ans+=(n-Math.max(ra,rb)+0L);
            }
            if(s.charAt(i)=='a')ca--;
            if(s.charAt(i)=='b')cb--;
        }
        System.out.println(ans);
    }
}
