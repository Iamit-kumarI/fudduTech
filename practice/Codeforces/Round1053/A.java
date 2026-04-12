package Codeforces.Round1053;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner inpt=new Scanner(System.in);
        int n=inpt.nextInt();//max no
        int favlen=inpt.nextInt();//lfav arr
        int []arr=new int[favlen];
        int max=0;
            for(int i=0;i<favlen;i++){
                arr[i]=inpt.nextInt();
                max=Math.max(max,arr[i]);
            }
//        int count=maxno+1-max;
        System.out.println(n+1-max);
    }
}
