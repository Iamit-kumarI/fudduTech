package Leetcode.Biweekly.BW177;

import java.nio.charset.IllegalCharsetNameException;
import java.util.*;

public class Q1 {
    public static void main(String[] args) {
        int[]arr={1,1,2,2,3,4};
        System.out.println(minDistinctFreqPair(arr));
    }
    public static int[] minDistinctFreqPair(int[] nums) {
        if(nums.length==1)return new int[]{-1};
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int val:nums){
            map.put(val,map.getOrDefault(val,0)+1);
        }
        if(map.size()<2)return new int[]{-1,-1};
        List<Integer> list=new ArrayList<>(map.keySet());
        Collections.sort(list);
        for(int i=0;i<list.size();i++){
            int cur=list.get(i);
            for(int j=i+1;j<list.size();j++){
                int cur2=list.get(j);
                if(!map.get(cur).equals(map.get(cur2)))return new int[]{cur,cur2};
            }
        }
        return new int[]{-1,-1};
    }
}
