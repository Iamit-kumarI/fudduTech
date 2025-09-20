//package Codeforces.ContextGlobalDev1Dev2;

import java.util.Scanner;

//sortest increasing path
public class A {
    public static void main(String[] args) {
        Scanner inpt=new Scanner(System.in);
        int n=inpt.nextInt();
        while(n-->0){
            int x=inpt.nextInt();
            int y=inpt.nextInt();
            System.out.println(steps(x,y));
        }
    }
    public static int steps(int x,int y){
        if(x>y)return -1;
        if(x==y&&x==1)return -1;//first step is 1 and then how can we go next
        if(y>x+1)return 2;
        return 3;
    }
}
