package Atcoder.ABC435;

import java.util.ArrayList;
import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int[]arr=new int[a];
        for(int i=0;i<a;i++)arr[i]=sc.nextInt();
        long ans=0;
        for(int l=0;l<a;l++){
            long sum=0;
            for(int r=l;r<a;r++){
                sum+=arr[r];
                boolean found=true;
                for(int i=l;i<=r;i++){
                    if(sum%arr[i]==0){
                        found=false;
                        break;
                    }
                }
                if(found)ans++;
            }
        }
        System.out.println(ans);
    }
}
