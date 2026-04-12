package CodeChef.Starter227;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int[]arr=new int[n];
            for(int i=0;i<n;i++)arr[i]=sc.nextInt();
            String str=sc.next();
            List<Integer>avalSeat=new ArrayList<>();
            for(int i=0;i<n;i++){
                if(str.charAt(i)=='0')avalSeat.add(arr[i]);
            }
            if(avalSeat.size()<k){
                System.out.println(-1);
                continue;
            }
            Collections.sort(avalSeat);
            int sum=0;
            for(int i=0;i<k;i++){
                sum+=avalSeat.get(i);
            }
            System.out.println(sum);
        }
    }
}
