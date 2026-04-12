package Atcoder.ABC427Panasonic;

import java.util.Scanner;

public class A {
    // Len is odd 3,5,7,... delete l+1/2 and give new string
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringBuilder ans=new StringBuilder(sc.next());
        ans.deleteCharAt((ans.length()+1)/2);
        System.out.println(ans.toString());
    }
}
