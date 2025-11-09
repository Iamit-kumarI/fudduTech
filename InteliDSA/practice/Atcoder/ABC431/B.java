package Atcoder.ABC431;

import java.util.Arrays;
import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x= sc.nextInt();
        int n=sc.nextInt();
//        int len=sc.nextInt();
        int []arr=new int[n];
        boolean[]bln=new boolean[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.fill(bln,true);
        int Q=sc.nextInt();
        for(int i=0;i<Q;i++){
            int val=sc.nextInt();
            if(bln[val-1]){
                x+=arr[val-1];
                bln[val-1]=false;
            }else{
                x-=arr[val-1];
                bln[val-1]=true;
            }
            System.out.println(x);
        }
    }
}
