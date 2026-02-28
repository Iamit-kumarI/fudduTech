package Atcoder.ABC447;

import java.util.Arrays;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int aindex=0,bindex=0,cindex=0;
        int count=0;
        for(char c:s.toCharArray()){
            if(c=='A'){
                aindex++;
            }else if(c=='B'){
                if(aindex>0){
                    aindex--;
                    bindex++;
                }
            }else{
                if(bindex>0){
                    bindex--;
                    cindex++;
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
