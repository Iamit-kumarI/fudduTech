package Atcoder.ABC433;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
//        if(z*y==x) {
//            System.out.println("Yes");
//            return;
//        }
        if(z==1){
            System.out.println(x==y?"Yes":"No");
            return;
        }
        long rem=x-z*y;
        long div=z-1;
        if(rem%div==0&&rem/div>=0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
