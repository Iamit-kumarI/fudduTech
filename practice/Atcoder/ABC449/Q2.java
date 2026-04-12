package Atcoder.ABC449;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int h=sc.nextInt();
        int w=sc.nextInt();
        int q=sc.nextInt();
        while(q-->0){
            int type=sc.nextInt();
            if(type==1){
                int row=sc.nextInt();
                System.out.println((long)row*w);
                h-=row;
            }else{
                int col=sc.nextInt();
                System.out.println((long)col*h);
                w-=col;
            }
        }
    }
}
