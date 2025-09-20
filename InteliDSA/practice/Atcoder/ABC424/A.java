package Atcoder.ABC424;

import java.util.Scanner;

public class A {
        public static void main(String[] args) {
            Scanner inpt=new Scanner(System.in);
            int a=0,b=0,c=0;
            a=inpt.nextInt();
            b=inpt.nextInt();
            c=inpt.nextInt();
            if(a==b){
                System.out.println("Yes");
            }else if(a==c) {
                System.out.println("Yes");
            }else if(b==c){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }

        }
}

