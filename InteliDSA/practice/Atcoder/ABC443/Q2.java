package Atcoder.ABC443;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long k=sc.nextLong();
        long total=0L,ans=n,time=0;
        while(total<k){
            total+=ans;
            ans++;
            if(total>=k)break;
            time++;
        }
        System.out.println(time);
    }
}
