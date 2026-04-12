package Atcoder.ABC449;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int l=sc.nextInt();
        int r=sc.nextInt();
        String s=sc.next();
        int ans=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(s.charAt(i)==s.charAt(j)&&l<=j-i&&j-i<=r){
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}
