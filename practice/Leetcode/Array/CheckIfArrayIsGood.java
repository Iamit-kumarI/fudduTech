package Leetcode.Array;

import java.util.Arrays;

public class CheckIfArrayIsGood {
    public static void main(String[] args) {
        int[]arr={1, 3, 3, 2};
        System.out.println(isGood(arr));
    }
    public static boolean isGood(int[] nums) {
        int[]freq=new int[201];
        for(int val:nums)freq[val]++;
        if(freq[nums.length-1]!=2)return false;
        for(int i=0;i<201;i++){
            if(freq[i]!=1)return false;
        }
        return true;
    }
}
