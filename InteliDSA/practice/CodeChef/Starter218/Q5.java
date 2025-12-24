package CodeChef.Starter218;

import java.util.Scanner;

public class Q5 {
    static final int modVal=998244353;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long n=sc.nextLong();
            long m=sc.nextLong();
            if(n==1){
                System.out.println((m+1)%modVal);
                continue;
            }
            long val=0,temp=m;
            while(temp>0){
                temp>>=1;
                val++;
            }
            long x=(1L<<val)-1;
            long ans=(m+1-(x^m))%modVal;
            System.out.println(ans);
        }
    }
}
