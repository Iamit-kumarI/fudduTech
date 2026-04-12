package Codeforces.R800;

import java.util.Scanner;

public class NewYearCake {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int layer=Math.max(First(a,b),First(b,a));
            System.out.println(layer);
        }
    }
    public static int First(int a,int b){
        int layer=0,i=1;
        while(true){
            if(a<i)break;
            a-=i;
            if(a>=0)layer++;
            i*=2;
            if(b<i)break;
            b-=i;
            if(b>=0)layer++;
            i*=2;
        }
        return layer;
    }
}
