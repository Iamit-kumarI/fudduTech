package Atcoder.ABC442;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),vol=0;
        boolean isPlaying=false;
        while(n-->0){
            int cur=sc.nextInt();
            if(cur==1)vol+=1;
            else if(cur==2&&vol>=1){
                vol-=1;
            }else if(cur==3)isPlaying=!isPlaying;
            System.out.println(isPlaying&&vol>=3?"Yes":"No");
        }
    }
}
