package Atcoder.ABC450;

import java.util.Arrays;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[]win=new int[n];
        for(int i=0;i<n;i++)win[i]=sc.nextInt()%k;
        Arrays.sort(win);
        int ans=win[n-1]-win[0];
        for(int i=0;i<n-1;i++){
            int curGap=win[i]+k-win[i+1];
            ans=Math.min(ans,curGap);
        }
        System.out.println(ans);
    }
}
