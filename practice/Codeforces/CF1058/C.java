package Codeforces.CF1058;

import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n-->0){
            int num=sc.nextInt();

        }
    }

    public static String inttobinary(int n){
        StringBuilder binary=new StringBuilder();
        while(n!=0){
            if((n&1)==0)binary.append(1);
            else binary.append(0);
            n=n>>1;
        }
        return new StringBuilder(binary).reverse().toString();
    }
    public static int binarytoInterger(int n){
        String rev=inttobinary(n);
        int sum=0;
        int power=0;
        int num=Integer.parseInt(rev);
        while(num>0){
            int rem=num%10;
            if(rem==1){
                sum+=(rem*(int)Math.pow(2,power));
            }
            power++;
            num/=10;
        }
        return sum;
    }//Integer.parseInt(sb.tostring(),2) strbuil -> str -> int -> base 2 int
     // int to bin and bin to int removing leading 0
}
