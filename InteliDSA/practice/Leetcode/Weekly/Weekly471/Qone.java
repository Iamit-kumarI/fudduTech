package Leetcode.Weekly.Weekly471;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Qone {
    public static void main(String[] args) {
        int []arr={1,2,2,3,3,3,3,4,5};
        System.out.println(sumDivisibleByK(arr,2));
    }
    public static int sumDivisibleByK(int[] nums, int k) {
        //can be done by shorting the array and then traversing
        //can be done by hashmap
        HashMap<Integer,Integer> map=new HashMap<>();
        Set<Integer> set=new HashSet<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
            if(!set.contains(num))set.add(num);
        }
        int ans=0;
        for(int num:set){
            int freq=map.get(num);
            if(freq%k==0){
                ans+=freq*num;
            }
        }
        return ans;
    }
}
