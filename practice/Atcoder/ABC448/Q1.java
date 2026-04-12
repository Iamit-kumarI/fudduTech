package Atcoder.ABC448;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int x=sc.nextInt();
       int[]arr=new int[n];
       for(int i=0;i<n;i++){
           arr[i]=sc.nextInt();
       }
       for(int val:arr){
           if(val<x){
               x=val;
               System.out.println(1);
           }else System.out.println(0);
       }
    }
}
