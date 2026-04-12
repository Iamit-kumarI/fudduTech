package CodeChef.Starter220;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int []arr=new int[n+1];
            for(int i=0;i<n;i++)arr[i]=sc.nextInt();
            int ans=Integer.MAX_VALUE;
            for(int i=0;i<n;i++){
                int cur=Math.max(arr[i],arr[i+1]);
                ans=Math.min(cur,ans);
            }
            System.out.println(ans);
        }
    }
}
