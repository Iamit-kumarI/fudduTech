package Codeforces.R800;

import java.util.HashSet;
import java.util.Scanner;

public class HowMuchDoesDaytonaCost {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            HashSet<Integer>set=new HashSet<>();
            int n=sc.nextInt();
            int k=sc.nextInt();
            for(int i=0;i<n;i++)set.add(sc.nextInt());
            if(set.contains(k)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
