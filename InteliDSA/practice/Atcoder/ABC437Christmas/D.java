package Atcoder.ABC437Christmas;

import java.util.Arrays;
import java.util.Scanner;

public class D {
    public static void main(String[] args) {
        long mod=998244353L;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        long[]arrA=new long[n];
        long[]arrB=new long[m];
        for(int i=0;i<n;i++)arrA[i]=sc.nextInt();
        for(int i=0;i<m;i++)arrB[i]=sc.nextInt();
        Arrays.sort(arrB);
        long[]temp=new long[m+1];
        for(int i=0;i<m;i++){
            temp[i+1]=(temp[i]+arrB[i])%mod;
        }
        long ans=0;
        for(int i=0;i<n;i++){
            long cur=arrA[i];
            int loc=searchUpperBound(arrB,cur);
            long left=loc;
            long right=m-loc;
            long sum1=(cur*left%mod-temp[loc]+mod)%mod;
            long sum2=((temp[m]-temp[loc]+mod)%mod-cur*right%mod+mod)%mod;
            ans=(ans+sum1+sum2)%mod;
        }
        System.out.println(ans);
    }
    public static int searchUpperBound(long[]arr,long val){
        int start=0,end=arr.length;
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]<val)start=mid+1;
            else end=mid;
        }
        return start;
    }

}
