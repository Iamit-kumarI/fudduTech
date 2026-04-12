package Codeforces.R800;

import java.util.Scanner;

public class HalloumiBoxes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();

            int k=sc.nextInt();
            int[]arr=new int[n];
            for(int i=0;i<n;i++)arr[i]=sc.nextInt();
            if(k>1){
                System.out.println("Yes");
            }else {
                boolean isAlreadySortated=true;
                for(int i=1;i<n;i++){
                    if(arr[i-1]>arr[i]){
                        isAlreadySortated=false;
                        break;
                    }
                }
                System.out.println(isAlreadySortated?"Yes":"No");
            }
        }
    }
}
