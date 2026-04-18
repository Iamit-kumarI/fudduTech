package Leetcode.Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MinAbsDiffBetweenAbsPairs {
    public static void main(String[] args) {
        int[]arr={21,120};
        System.out.println(minMirrorPairDistance(arr));
    }
    public static int minMirrorPairDistance(int[] nums) {
        int ans=Integer.MAX_VALUE,n=nums.length;
        Map<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<n;i++){
            if(map.containsKey(nums[i]))ans=Math.min(ans,i-map.get(nums[i]));
            map.put(revhelper(nums[i]),i);
        }
        return ans==Integer.MAX_VALUE?-1:ans;
    }
    public static int revhelper(int num){
        int n=0;
        while(num!=0){
            n=n*10+num%10;
            num=num/10;
        }
        return n;
    }
}
