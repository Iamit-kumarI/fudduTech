package CodeChef.Starter219;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int s=b*100;
            int l=a*225;
            if(s>l) System.out.println("Small");
            else if(s<l) System.out.println("Large");
            else System.out.println("Equal");
        }
    }
}
