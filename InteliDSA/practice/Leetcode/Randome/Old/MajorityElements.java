package Leetcode.Randome.Old;

import java.util.HashMap;

public class MajorityElements {
    public static void main(String[] args) {
        int []nums={2,2,1,1,1,2,2};
        System.out.println(majority(nums));
    }
    public static int majority(int []arr){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int val:arr){
            map.put(val,map.getOrDefault(val,0)+1);
        }
        for(int val:arr){
            if(map.get(val)>=arr.length/2)return val;
        }
        return -1;
    }
}
