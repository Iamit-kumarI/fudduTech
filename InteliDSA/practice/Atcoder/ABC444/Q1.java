package Atcoder.ABC444;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=Integer.toString(n);
        char lastChar=s.charAt(0);
        boolean allsame=true;
        for(char c:s.toCharArray()){
            if(c!=lastChar){
                allsame=false;
                break;
            }
        }
        System.out.println(allsame?"Yes":"No");
    }
}
