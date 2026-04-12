package CodeChef.Starter216;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int x=sc.nextInt();
            int y=sc.nextInt();
            System.out.println((x+y)/2+" "+(y-x)/2);
        }
    }
}
