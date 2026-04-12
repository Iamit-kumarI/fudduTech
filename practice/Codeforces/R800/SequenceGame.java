package Codeforces.R800;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SequenceGame {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[]b=new int[n];
            for(int i=0;i<n;i++)b[i]=sc.nextInt();
            List<Integer> ans=new ArrayList<>();
            ans.add(b[0]);
            for(int i=1;i<n;i++){
                if(b[i]<b[i-1]){
                    ans.add(b[i]);
                }
                ans.add(b[i]);
            }
            System.out.println(ans.size());
            ans.stream().forEach(x-> System.out.print(x+" "));
            System.out.println();
        }
    }
}
