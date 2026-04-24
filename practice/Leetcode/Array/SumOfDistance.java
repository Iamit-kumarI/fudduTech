package Leetcode.Array;

import java.nio.charset.IllegalCharsetNameException;
import java.util.*;

public class SumOfDistance {
    public static void main(String[] args) {
        int[]arr={1,3,1,1,2};
        System.out.println(Arrays.toString(distance(arr)));
    }
    public static long[] distance(int[] nums) {
        Map<Integer, List<Integer>> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int cur=nums[i];
            if(map.containsKey(cur))map.get(cur).add(i+1);
            else{
                List<Integer>list=new ArrayList<>();
                list.add(i+1);
                map.put(cur,list);
            }
        }
        long[]ans=new long[nums.length];
        for(int i=0;i<nums.length;i++){
            List<Integer>cur=map.get(nums[i]);
            if(cur==null||cur.size()<=1)ans[i]=0;
            else{
                int sumAbs=0;
                for(int val:cur){
                    sumAbs+=Math.abs(i+1-val);
                }
                ans[i]=sumAbs;
            }
        }
        return ans;
    }
}
