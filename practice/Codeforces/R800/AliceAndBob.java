package Codeforces.R800;

import java.util.Arrays;
import java.util.Scanner;

public class AliceAndBob {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int a=sc.nextInt();
            int[]arr=new int[n];
            for(int i=0;i<n;i++)arr[i]=sc.nextInt();
            Arrays.sort(arr);
            int val=(a+arr[0])/2;
            int mid1=(a+val)/2;
            int val2=(a+arr[n-1])/2;
            int mid2=(a+val2)/2;
            int ans=Math.max(helper(arr,mid1),helper(arr,mid2));
            System.out.println(ans);
        }
    }
    public static int helper(int[]arr,int mid){
        int left=0,right=arr.length-1,ans=0;
        while(left<=right){
            left++;
        }
        return 1;
    }
}
