package Codeforces.R800;

import java.util.Scanner;

public class TargetPractice {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int[]arr=new int[6];
            for(int i=0;i<10;i++){
                for(int j=1;j<=10;j++){
                    char cur=sc.next().charAt(0);
                    if(cur=='X'){
                        arr[j%5]++;
                    }
                }
            }
            int ans=0;
            for(int i=1;i<=5;i++){
                ans+=(i*arr[i]);
            }
            System.out.println(ans);
        }
    }
}
