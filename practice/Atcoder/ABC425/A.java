package Atcoder.ABC425;

import java.util.Scanner;

//A
public class A {
    public static void main(String[] args) {
        Scanner inpt=new Scanner(System.in);
        int n=inpt.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=(int)Math.pow(-1,i)*(int)Math.pow(i,3);
        }
        System.out.println(sum);
    }
}
