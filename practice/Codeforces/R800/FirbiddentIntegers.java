package Codeforces.R800;

import java.util.Scanner;

public class FirbiddentIntegers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int x=sc.nextInt();
            if(k==1){
                System.out.println("No");
            }else if(x!=1){
                System.out.println("Yes");
                System.out.println(n);
                while(n>0){
                    System.out.println(1);
                    n--;
                }
                continue;
            }else{
                if(n%2==0&&x!=2){
                    System.out.println("Yes");
                    int len=n/2;
                    System.out.println(len);
                    while(len>0){
                        System.out.println(2);
                        len--;
                    }
                    continue;
                }else{
                    int mod=n%k;
                    if(mod!=x){
                        System.out.println("Yes");
                        int len=k;
                        while(len>0){
                            System.out.println(k);
                            len--;
                        }
                        if(mod!=0) System.out.println(mod);
                        continue;
                    }
                }
            }
            System.out.println("No");
        }
    }
}
