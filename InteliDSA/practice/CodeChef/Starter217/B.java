package CodeChef.Starter217;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            long sum=0;
            for(int i=0;i<n;i++)sum+=sc.nextInt();
            if(sum>=0) System.out.println(0);
            else{
                long val=(-sum+n-1)/n;
                System.out.println(val);
            }
        }
    }
}
