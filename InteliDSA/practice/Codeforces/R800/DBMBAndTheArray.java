package Codeforces.R800;

import java.util.Scanner;

public class DBMBAndTheArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int s=sc.nextInt();
            int x=sc.nextInt();
            int[]arr=new int[n];
            int sum=0;
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                sum+=arr[i];
            }
            boolean ans=false;
            while(sum<=s){
                if(sum==s){
                    ans=true;
                }
                sum+=x;
            }
            System.out.println(ans?"Yes":"No");
        }
    }
}
