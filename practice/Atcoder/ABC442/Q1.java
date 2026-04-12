package Atcoder.ABC442;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int ans=0;
        for(char c:s.toCharArray())if(c=='i'||c=='j')ans++;
        System.out.println(ans);
    }
}
