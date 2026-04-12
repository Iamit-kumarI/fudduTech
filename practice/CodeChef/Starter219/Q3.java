package CodeChef.Starter219;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[]arr=new int[n];
            for(int i=0;i<n;i++)arr[i]=sc.nextInt();
            long[][]dpmin=new long[n][n];
            long[][]dpmax=new long[n][n];
            for(int i=0;i<n;i++){
                dpmin[i][i]=arr[i];
                dpmax[i][i]=arr[i];
            }
            for(int len=2;len<=n;len++){
                for(int i=0;i+len-1<n;i++){
                    int r=i+len-1;
                    dpmin[i][r]=Integer.MAX_VALUE;
                    dpmax[i][r]=Integer.MIN_VALUE;
                    for(int k=i;k<r;k++){
                        dpmin[i][r]=Math.min(dpmin[i][r],dpmin[i][k]+2*dpmin[k+1][r]);
                        dpmax[i][r]=Math.max(dpmax[i][r],dpmax[i][k]+2*dpmax[k+1][r]);
                    }
                }
            }
            System.out.println(dpmin[0][n-1]+" "+dpmax[0][n-1]);
        }
    }
}
