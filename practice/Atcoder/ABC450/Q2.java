package Atcoder.ABC450;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][]carr=new int[n][n];
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                carr[i][j]=sc.nextInt();
            }
        }
        for(int a=0;a<n;a++){
            for(int b=a+1;b<n;b++){
                for(int c=b+1;c<n;c++){
                    if(carr[a][b]+carr[b][c]<carr[a][c]){
                        System.out.println("Yes");
                        return;
                    }
                }
            }
        }
        System.out.println("No");
    }
}
