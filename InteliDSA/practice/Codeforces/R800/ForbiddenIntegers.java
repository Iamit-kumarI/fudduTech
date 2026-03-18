package Codeforces.R800;

import java.util.Scanner;

public class ForbiddenIntegers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int x=sc.nextInt();
            if(k==1) System.out.println("No");
            else{
                System.out.println("Yes");
                System.out.println(n);
                while(n>0){
                    System.out.print(1);
                    n--;
                }
            }
        }
    }
}
