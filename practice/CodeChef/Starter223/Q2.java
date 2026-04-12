package CodeChef.Starter223;

import java.util.Map;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),x=sc.nextInt(),k=sc.nextInt();
            int ans=Integer.MAX_VALUE;
            for(int i=0;i<=n;i+=k){
                ans=Math.min(ans,Math.abs(x-i));
            }
            System.out.println(ans);
        }
    }
}
