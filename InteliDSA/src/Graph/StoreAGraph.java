package Graph;

import java.util.Scanner;

public class StoreAGraph {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int [][]arr=new int[n+1][m+1];
        for(int i=0;i<m;i++){
            int u=sc.nextInt();
            int v=sc.nextInt();
            // marking that this index have something its not zero means elemente exist there
            arr[u][v]=1;
            arr[v][u]=1;
        }
    }
}
