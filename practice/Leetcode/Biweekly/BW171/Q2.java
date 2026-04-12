package Leetcode.Biweekly.BW171;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q2 {
    public static void main(String[] args) {
        int[]nums={1,2,4};
        System.out.println(Arrays.toString(minOperations(nums)));
    }
    public static int[] minOperations(int[] nums) {
        int[]arr=new int[nums.length];
        int rem=0;
        for(int i=0;i<nums.length;i++){
            rem=nums[i];
            int val=rem;
            int bits=Integer.toBinaryString(val).length();
            int min=Integer.MAX_VALUE;
            for(int j=bits-1;j<=bits+1;j++){
                for(int a: givemeAns(j)){
                    min=Math.min(min,Math.abs(val-a));
                }
            }
            arr[i]=min;
        }
        return arr;
    }
    public static List<Integer> givemeAns(int givenBit){
        List<Integer> list=new ArrayList<>();
        if(givenBit<=0)return list;
        int mid=(givenBit+1)/2;
        int start=1<<(mid-1);

        int end=(1<<mid)-1;
        for(int i=start;i<=end;i++){
            String first=Integer.toBinaryString(i);
            String second=new StringBuilder(first.substring(0,givenBit/2)).reverse().toString();
            String pos=first+second;
            list.add(Integer.parseInt(pos,2));
        }
        return list;
    }
}
