package CodeChef.Starter227;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int s=sc.nextInt();
            int maxNo6=5*n;
            int max=6*n;
            if(s<=maxNo6) System.out.println(maxNo6);
            else System.out.println(max-(s-maxNo6));
        }
    }
}
