package Atcoder.ARC209;

import java.util.Scanner;
//not accepted
public class A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n-->0){
            String str=sc.next();
            int k=sc.nextInt();
            System.out.println(helper(str,k));
        }
    }
    public static String helper(String str,int k){
        if((str.length()-k)%2==1)return "First";
        if(isValid(str,k)) return "Second";
        return "First";
    }
    public static boolean isValid(String str,int k){
        int n=str.length();
        int[]arr=new int[n+1];
        for(int i=0;i<n;i++){
            arr[i+1]=arr[i]+(str.charAt(i)=='('?1:-1);
        }
        int a=0;
        for(int i=k;i<=n;i++){
            int sum=arr[i]-arr[i-k];
            if(sum==0){
                int min=Integer.MAX_VALUE;
                for(int j=i-k;j<i;j++){
                    min=Math.min(min,arr[j]-arr[i-k]);
                }
                if(min>=0)return true;
            }
        }
        return false;
    }
}
