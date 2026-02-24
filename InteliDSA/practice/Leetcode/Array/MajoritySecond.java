package Leetcode.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class MajoritySecond {
    public static void main(String[] args) {
        int[]arr={3,3,3,3,3,3,3};
        System.out.println(majorityElement(arr));
    }
    public static List<Integer> majorityElement(int[] nums) {
        List<Integer>list=new ArrayList<>();
        if(nums.length<=2){
            if(nums.length==2){
                list.add(nums[0]);
                if(!list.contains(nums[1]))list.add(nums[1]);
            }else list.add(nums[0]);
            return list;
        }
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int val:nums){
            if(map.containsKey(val)){
                if(map.get(val)>=nums.length/3){
                    if(!list.contains(val))list.add(val);
                } else map.put(val,map.getOrDefault(val,0)+1);
            }else map.put(val,1);
        }
        return list;
    }
}
