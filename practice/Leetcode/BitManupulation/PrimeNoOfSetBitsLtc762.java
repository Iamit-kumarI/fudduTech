package Leetcode.BitManupulation;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class PrimeNoOfSetBitsLtc762 {
    public static void main(String[] args) {
        long starttime=System.currentTimeMillis();
        System.out.println(countPrimeSetBits(10,15));
        System.out.println(System.currentTimeMillis()-starttime);
//        String s="u Thank";
//        String[]words=s.split(" ");
//        StringBuilder sb=new StringBuilder(words[1]);
//        System.out.println(sb.append(" "+words[0]).toString());

//        System.out.println(System.currentTimeMillis()-starttime);

//        String result=words[1]+" "+words[0];
//        System.out.println(result);
//        System.out.println(System.currentTimeMillis()-starttime);

    }
    public static int countPrimeSetBits(int left, int right) {
        int count=0;
        Set<Integer> set=new HashSet<>();
        set.add(2);
        set.add(3);
        set.add(5);
        set.add(7);
        set.add(11);
        set.add(13);
        set.add(17);
        set.add(19);
        set.add(23);
        set.add(29);
        set.add(31);
        while (left<=right){
            int curBit=Integer.bitCount(left++);
            if(curBit==(2)||curBit==(3)||curBit==(5)||curBit==(7)||curBit==(11)||curBit==(13)||curBit==(17)||curBit==(19)||curBit==(23)||curBit==(29)||curBit==31)count++;
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
