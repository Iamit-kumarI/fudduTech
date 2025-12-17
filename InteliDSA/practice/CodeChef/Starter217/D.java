package CodeChef.Starter217;

import java.util.Scanner;

public class D {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            long[]arr=new long[n];
            for(int i=0;i<n;i++)arr[i]=sc.nextLong();
            long diff=arr[1]-arr[0];
            for(int i=2;i<n;i++){
                diff= helper(diff,arr[i]-arr[i-1]);
            }
            long total=(arr[n-1]-arr[0])/diff+1;
            System.out.println(total-n);
        }
    }
    public static long helper(long a, long b){
        return b==0?a: helper(b,a%b);
    }
}
