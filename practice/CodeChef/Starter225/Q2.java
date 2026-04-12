package CodeChef.Starter225;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[]arrA=new int[n];
            int[]arrB=new int[n];
            int sum=0;
            for(int i=0;i<n;i++){
                arrA[i]=sc.nextInt();
                sum+=arrA[i];
            }
            int ans=Integer.MAX_VALUE;
            int index=0;
            for(int i=0;i<n;i++){
//                int val=
                ans=Math.min(ans,arrA[index++]-sc.nextInt());
            }
            System.out.println(sum-ans);
        }
    }
}
