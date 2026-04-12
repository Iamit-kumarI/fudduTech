package Codeforces.R800;

import java.util.Scanner;

public class DontTryCount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            StringBuilder x=new StringBuilder(sc.next());
            StringBuilder s=new StringBuilder(sc.next());
            int count=0;
            boolean found=false;
            while(x.length()<=50){
                if(isSubstring(x,s)){
                    found=true;
                    break;
                }
                x.append(x);
                count++;
            }
            System.out.println(found?count:-1);
        }
    }
    public static boolean isSubstring(StringBuilder x,StringBuilder s){
        return x.toString().contains(s);
    }
}
