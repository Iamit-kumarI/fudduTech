package Atcoder.ABC429;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        int m=sc.nextInt();
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(isPossibleM(arr,m)?"Yes":"No");
    }
    public static boolean isPossibleM(int []arr,int m){
        int sum=0;
        for(int num:arr)sum+=num;
        for(int num:arr){
            if((sum-num)==m)return true;
        }
        return false;
    }

}
