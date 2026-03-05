package Codeforces.R800;

import java.util.Arrays;
import java.util.Scanner;

public class JaggedSwap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int[]arr=new int[n];
            int[]sortedVer=new int[n];
            for(int i=0;i<n;i++){
                int cur=sc.nextInt();
                arr[i]=cur;
                sortedVer[i]=cur;
            }
            if(isAlreadySorted(arr)){
                System.out.println("Yes");
            }else{
                Arrays.sort(sortedVer);
                if(arr[0]==sortedVer[0]){
                    System.out.println("Yes");
                }else System.out.println("No");
            }
        }
    }
    public static boolean isAlreadySorted(int[]arr){
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1])return false;
        }
        return true;
    }
}
