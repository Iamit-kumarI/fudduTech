package Leetcode.Array;

import java.util.HashMap;

public class MajorityElement {
    public static void main(String[] args) {
        int[]arr={2,2,1,1,1,2,2};
        System.out.println(majorityElement(arr));
    }
    public static int majorityElement(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int val:nums){
            if(map.containsKey(val)){
                if(map.get(val)>=nums.length/2)return val;
                else map.put(val,map.get(val)+1);
            }else map.put(val,1);
        }
        return 0;
    }
}
