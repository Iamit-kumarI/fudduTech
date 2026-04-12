package CodeChef.Starter219;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            String s=sc.next();
            int one=0,zeroCount=0,suc=0;
            for(char c:s.toCharArray()){
                if(c=='1'){
                    one++;
                }else{
                    zeroCount++;
                }
                if(one>=zeroCount)suc++;
            }
            System.out.println(suc);
        }
    }
}
