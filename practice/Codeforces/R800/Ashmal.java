package Codeforces.R800;

import java.util.Arrays;
import java.util.Scanner;

public class Ashmal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            String ans="";
            for(int i=0;i<n;i++){
                String cur=sc.next();
                String option1=ans+cur;
                String option2=cur+ans;
                if(option1.compareTo(option2)<=0){
                    ans=option1;
                }else ans=option2;
            }
            System.out.println(ans.toString());
        }
    }
}
