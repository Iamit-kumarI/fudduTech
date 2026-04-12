package Atcoder.ABC436;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][]grid=new int[n][n];
        int row=0,col=n/2;
        for(int i=1;i<=n*n;i++){
            grid[row][col]=i;
            int newrow=(row-1+n)%n;
            int newcol=(col+1)%n;
            if(grid[newrow][newcol]==0){
                row=newrow;
                col=newcol;
            }else row=(row+1)%n;
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(grid[i][j]);
                if(j+1<n) System.out.print(" ");
            }
            System.out.println();
        }
    }
}
