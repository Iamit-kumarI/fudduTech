package Atcoder.ARC208;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n-->0){
            int size=sc.nextInt();
            int[]arr=new int[size];
            for (int i =0;i<size; i++) {
                arr[i]=sc.nextInt();
            }
            System.out.println(winfunc(arr));
        }
    }
    public static String winfunc(int []arr){
        int mbit=0;
        for(int num:arr)mbit=Math.max(mbit,Integer.highestOneBit(num));
        for(int i=32;i>=0;i--){
            int count=0;
            for(int val:arr){
                if(((val>>i)&1)==1)count++;
            }
            if(count%2==1){
                if((arr.length-count)%2==0)return "Alice";
                else return "Bob";
            }
        }
        return "Bob";
    }
}
