package CodeChef.Starter216;

import java.util.Arrays;
import java.util.Scanner;

public class D {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[]arr=new int[n];
            for(int i=0;i<n;i++)arr[i]=sc.nextInt();
            Arrays.sort(arr);
            int max=0;
            int[]dp=new int[n];
            for(int i=0;i<n;i++){
                dp[i]=1;
                for(int j=0;j<i;j++){
                    if((arr[i]&arr[j])==arr[j])dp[i]=Math.max(dp[i],dp[j]+1);
                }
                max=Math.max(max,dp[i]);
            }
            System.out.println(max);
        }
    }
}
