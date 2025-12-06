package Atcoder.ABC435;

import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++)arr[i]=sc.nextInt();
        int max=arr[0],i=1;
        while(i<n&&i<=max-1){
            max= Math.max(max,i+arr[i]);
            i++;
        }
        if(max>n)max=n;
        System.out.println(max);
    }
}
