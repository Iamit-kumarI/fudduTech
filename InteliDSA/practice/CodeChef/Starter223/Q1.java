package CodeChef.Starter223;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int x=sc.nextInt(),y=sc.nextInt(),z=sc.nextInt();
            int temp=Math.min(x,z);
            int pair=y/2;
            System.out.println(temp+pair);
        }
    }
}
