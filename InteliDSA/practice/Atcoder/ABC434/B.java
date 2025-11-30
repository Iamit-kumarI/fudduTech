package Atcoder.ABC434;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        double[]total=new double[m+1];
        int []freq=new int[m+1];
        for(int i=0;i<n;i++){
            int type=sc.nextInt();
            double size=sc.nextDouble();
            total[type]+=size;
            freq[type]++;
        }
        for(int i=1;i<=m;i++){
            if(freq[i]>0){
                double ans=total[i]/freq[i];
                System.out.printf("%.20f\n",ans);
            }else{
                System.out.printf("%.20f\n",0.0);
            }
        }
    }
}
