package Atcoder.ABC447;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String t=sc.next();
        int i=0,j=0,operation=0;
        while(i<s.length()||j<t.length()){
            int countAinS=0;
            while(i<s.length()&&s.charAt(i)=='A'){
                countAinS++;
                i++;
            }
            int countAinT=0;
            while(j<t.length()&&t.charAt(j)=='A'){
                countAinT++;
                j++;
            }
            operation+=Math.abs(countAinS-countAinT);
            if(i==s.length()&&j==t.length())break;
            if(i==s.length()||j==t.length()||s.charAt(i)!=t.charAt(j)){
                System.out.println(-1);
                return;
            }
            i++;
            j++;
        }
        System.out.println(operation);
    }
}
