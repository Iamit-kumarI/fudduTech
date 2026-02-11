package CodeChef.Starter225;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            long sum=0;
            long secSum=0;
            for(int i=0;i<n;i++){
                int val=sc.nextInt();
                sum+=val;
                if(i%2==0){
                    secSum+=val;
                }else{
                    secSum-=val;
                }
            }
            if(n%2==0){
                if(secSum==0) System.out.println("Yes");
                else System.out.println("No");
            }else{
                if(sum%n==0) System.out.println("No");
                else System.out.println("No");
            }
        }
    }
}
