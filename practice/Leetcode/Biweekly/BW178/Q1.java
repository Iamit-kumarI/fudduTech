package Leetcode.Biweekly.BW178;

import java.util.*;

public class Q1 {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6};
        System.out.println(firstUniqueEven(arr));
    }
    public static int firstUniqueEven(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int val:nums){
            map.put(val,map.getOrDefault(val,0)+1);
        }
        for(int val:nums){
            if(val%2==0&&map.get(val)==1)return val;
        }
        return -1;
    }
}
