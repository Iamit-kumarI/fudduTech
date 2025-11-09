package Leetcode.Weekly.Weekly475;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class Q2 {
    public static void main(String[] args) {
        int []arr={1,2,1,1,3};
        System.out.println(minimumDistance(arr));
    }
    public static int minimumDistance(int[] nums) {
        Map<Integer, List<Integer>> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.computeIfAbsent(nums[i],k->new ArrayList<>()).add(i);
        }
        int res=Integer.MAX_VALUE;
        for(List<Integer> list:map.values()){
            if(list.size()<=2)continue;
            for(int i=0;i+2<list.size();i++){
                res=Math.min(2*(list.get(i+2)-list.get(i)),res);
            }
        }
        return res;
    }
}
