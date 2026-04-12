package Codeforces.R800;

import java.util.Arrays;
import java.util.Scanner;

public class TableWithNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int h=sc.nextInt();
            int l=sc.nextInt();
            int[]arr=new int[n];
            for(int i=0;i<n;i++)arr[i]=sc.nextInt();
            Arrays.sort(arr);
            int left=0,right=n-1,ans=0;
            while(left<right){
                if(arr[left]<=h&&arr[right]<=l){
                    ans++;
                    left++;
                    right--;
                }
                else if(arr[left]>h)left++;
                else right--;
            }
            System.out.println(ans);
        }
    }
}
