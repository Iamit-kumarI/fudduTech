package Leetcode.BitManupulation;

import java.util.Arrays;

public class PrimeNoOfSetBitsLtc762 {
    public static void main(String[] args) {
        long starttime=System.currentTimeMillis();
        System.out.println(countPrimeSetBits(10,15));
        System.out.println(System.currentTimeMillis()-starttime);
    }
    public static int countPrimeSetBits(int left, int right) {
        int count=0;
        int[]arr=new int[right-left];
        Arrays.fill(arr,-1);
        while(left<=right){
            int curNo=left;
            int setBit=0;
            while(curNo>0){
                if((curNo&1)==1)setBit++;
                curNo=curNo>>1;
            }
            if(arr[setBit]!=-1){
                count++;
                left++;
                continue;
            }
            else if(isPrime(setBit)){
                arr[setBit]=1;
                count++;
            }else{
                arr[setBit]=0;
            }
            left++;
        }
        return count;
    }
    public static boolean isPrime(int n){
        if(n<=1)return false;
        if(n==2)return true;
        if(n%2==0)return false;
        for(int i=3;i*i<=n;i++){
            if(n%i==0)return false;
        }
        return true;
    }
}
