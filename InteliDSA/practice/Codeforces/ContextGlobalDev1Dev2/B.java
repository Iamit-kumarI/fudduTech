package Codeforces.ContextGlobalDev1Dev2;

import java.util.Scanner;
//not able to solve even one
public class B {
    public static void main(String[] args) {
        Scanner inpt=new Scanner(System.in);
        int n=inpt.nextInt();
        while(n-->0){
            int val=inpt.nextInt();
            int[] result=occurence(val);
            for(int i=0;i<result.length;i++){
                System.out.print(result[i]+" ");
            }
            System.out.println();
        }
    }
    public static int []occurence(int n){
        int []arr=new int[n*2];
        int index=2*n-1;//from last
        for(int i=n;i>0;i--){
            arr[i]=i;
            arr[index-i]=n;
            index+=(i+1);
        }
        return arr;
    }
}
