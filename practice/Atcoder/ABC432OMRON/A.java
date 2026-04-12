package Atcoder.ABC432OMRON;

import java.util.Arrays;
import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int []arr={a,b,c};
        Arrays.sort(arr);
        int ans=arr[2];
        ans=ans*10+arr[1];
        ans=ans*10+arr[0];
        System.out.println(ans);
    }
}
