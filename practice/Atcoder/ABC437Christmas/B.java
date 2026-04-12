package Atcoder.ABC437Christmas;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int h=sc.nextInt();
        int w=sc.nextInt();
        int n=sc.nextInt();
        int[][]arr=new int[h][w];
        for(int i=0;i<h;i++){
            for(int j=0;j<w;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        Set<Integer>set=new HashSet<>();
        for(int i=0;i<n;i++)set.add(sc.nextInt());
        int count=0;
        for(int i=0;i<h;i++){
            int cur=0;
            for(int j=0;j<w;j++){
                if(set.contains(arr[i][j]))cur++;
            }
            count=Math.max(cur,count);
        }
        System.out.println(count);
    }
}
