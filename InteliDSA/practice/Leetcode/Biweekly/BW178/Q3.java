package Leetcode.Biweekly.BW178;

import java.util.HashMap;
import java.util.Map;

public class Q3 {
    public int minCost(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int[][]arrTrack={nums1,nums2};
        Map<Integer,Integer> map=new HashMap<>();
        Map<Integer,Integer>freq=new HashMap<>();
        for(int val:nums1){
            map.put(val,map.getOrDefault(val,0)+1);
            freq.put(val,freq.getOrDefault(val,0)+1);
        }
        for(int val:nums2){
            map.put(val,map.getOrDefault(val,0)+1);
        }
        for(int val:map.values()){
            if(val%2!=0)return -1;
        }
        int ans=0;
        for(int val:map.keySet()){
            int x=map.get(val)/2;
            int cont=freq.getOrDefault(val,0);
            if(cont>x){
                ans+=cont-x;
            }
        }
        return ans/2;
    }
}
