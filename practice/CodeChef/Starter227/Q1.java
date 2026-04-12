package CodeChef.Starter227;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int x=sc.nextInt();
            int y=sc.nextInt();
            int exch=a/x;
            System.out.println(a+b+exch*(y-x));
        }
    }
}
