package Codeforces.CF1058;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n-->0){
            int size=sc.nextInt();
            int []arr=new int[size];
            for(int i=0;i<size;i++){
                arr[sc.nextInt()]++;
            }
            int a=-1,b=-1;
            for(int i=0;i<size;i++){
                if(arr[i]==0&&a==-1)a=i;
                if(arr[i]==0&&b==-1)b=i;
            }
            if(a==-1)a=size;
            if(b==-1)b=size;
            System.out.println(Math.max(a,b));
        }
    }
}
