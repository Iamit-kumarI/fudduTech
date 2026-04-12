package CodeChef.Starter220;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int x=sc.nextInt();
            int y=sc.nextInt();
            if(x%2==1) System.out.println("Alice");
            else System.out.println("Bob");
        }
    }
}
