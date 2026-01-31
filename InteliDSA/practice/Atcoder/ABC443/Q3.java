package Atcoder.ABC443;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long givenTime=sc.nextLong();
        long[]arr=new long[n];
        for(int i=0;i<n;i++)arr[i]=sc.nextLong();
        long openHours=0L,total=0L;
        for(int i=0;i<n;i++){
            if(arr[i]<openHours)continue;
            total+=arr[i]-openHours;
            openHours=arr[i]+100;
        }
        if(openHours<givenTime)total+=givenTime-openHours;
        System.out.println(total);
    }
}
