package Atcoder.ABC427Panasonic;


import java.util.Scanner;
public class B {
    // 1,1,2,4,8,16, 23 how dry run for n=6
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        long []arr=new long[size+1];
        arr[0]=1;
        for(int i=1;i<=size;i++){
            long csum=0;
            for(int j=0;j<i;j++){
                csum+=digitsum(arr[j]);
            }
            arr[i]=csum;
        }
        System.out.println(arr[size]);
    }
    public static int digitsum(long digit){
        int sum=0;
        while(digit>0){
            sum+=digit%10;
            digit/=10;
        }
        return sum;
    }
}
