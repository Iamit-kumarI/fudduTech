package CodeChef.Starter218;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[]arr=new int[n];
            int[]arr2=new int[n];
            for(int i=0;i<n;i++)arr[i]=sc.nextInt();
            for(int i=0;i<n;i++)arr2[i]=sc.nextInt();
            long ans=0;
            int min=Integer.MAX_VALUE;
            for(int i=0;i<n;i++){
                min=Math.min(min,arr2[i]);
                ans+=(long)arr[i]*min;
            }
            System.out.println(ans);
        }
    }
}
