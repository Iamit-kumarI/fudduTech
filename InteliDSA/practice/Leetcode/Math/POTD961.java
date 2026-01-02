package Leetcode.Math;

import java.util.HashMap;
import java.util.Map;

public class POTD961 {
    public static void main(String[] args) {
        int[]arr={2,1,2,5,3,2};
        System.out.println(repeatedNTimes(arr));
    }
    public static int repeatedNTimes(int[] nums) {
        int n=nums.length/2,ans=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int val:nums){
            map.put(val,map.getOrDefault(val,0)+1);
        }
        for(Map.Entry<Integer,Integer>enteries:map.entrySet()){
            if(enteries.getValue()>=n)return enteries.getKey();
        }
        return ans;
    }
}
