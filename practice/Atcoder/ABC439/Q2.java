package Atcoder.ABC439;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//Happy Number
public class Q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean isHappy=false;
        int slow=n,fast=n;
        while(true){
            slow=squareSum(slow);
            fast=squareSum(squareSum(fast));
            if(fast==1){
                System.out.println("Yes");
                return;
            }
            if(slow==fast){
                System.out.println("No");
                return;
            }
        }
    }
    public static int squareSum(int n){
        int sum=0;
        while(n>0){
            int rem=n%10;
            sum+=rem*rem;
            n/=10;
        }
        return sum;
    }
}
