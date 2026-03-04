package Codeforces.R800;

import java.util.Scanner;

public class CoverInWater {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            String s=sc.next();
            int dotCount=0,continueousCount=0;
            boolean conFound=false;
            for(char c:s.toCharArray()){
                if(c=='.'){
                    dotCount++;
                    continueousCount++;
                }
                else continueousCount=0;
                if(continueousCount>=3){
                    conFound=true;
                }
            }
            System.out.println(conFound?2:dotCount);
        }
    }
}
