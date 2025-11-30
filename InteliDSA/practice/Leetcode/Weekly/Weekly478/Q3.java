package Leetcode.Weekly.Weekly478;

import java.util.HashMap;
import java.util.Map;

public class Q3 {
    public static void main(String[] args) {
        int[]arr={120,21};
        System.out.println(minMirrorPairDistance(arr));
    }
    public static int minMirrorPairDistance(int[] nums) {
        int[]freq=nums;
        Map<Integer,Integer> map=new HashMap<>();
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            int rev=reverse(freq[i]);
            if(map.containsKey(rev)){
                min=Math.min(min,i-map.get(rev));
            }
            map.put(freq[i],i);
        }
        return min==Integer.MAX_VALUE?-1:min;
    }
    public static int reverse(int n){
        int rev=0;
        while(n>0){
            rev=rev*10+n%10;
            n/=10;
        }
        return rev;
    }
}
