package CodeChef.Starter219;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            if(n==2){
                System.out.println(-1);
                continue;
            }
            int[][]grid=new int[n][n];
            grid[0][0]=1;
            grid[0][1]=1;
            grid[0][2]=1;
            grid[1][1]=1;
            grid[1][2]=1;
            grid[2][1]=1;
            grid[2][2]=1;
            for(int i=3;i<n;i++)grid[i][2]=1;
            for(int i=3;i<n;i++)grid[n-1][i]=1;
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    System.out.print(grid[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
}
