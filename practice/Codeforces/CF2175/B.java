package Codeforces.CF2175;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int l=sc.nextInt();
            int r=sc.nextInt();
            int[]arr=new int[n];
            for(int i=0;i<n;i++) {
                arr[i]=((i+1)<<17)^(i*1234567+89123);
            }
            int s=0;
            for(int i=l-1;i<=r-1;i++)s^=arr[i];
            if(s!=0)arr[l-1]^=s;
            for(int i=0;i<n;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }
}
