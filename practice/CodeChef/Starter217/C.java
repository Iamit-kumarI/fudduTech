package CodeChef.Starter217;

import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long n=sc.nextLong();
            long m=sc.nextLong();
            if(m>=n&&m<=3*n&&(m-n)%2==0) System.out.println("Yes");
            else System.out.println("No");
        }
    }
}
