package Leetcode.Weekly.Weekly488;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q2 {
    public static void main(String[] args) {
        int[]arr={3,1,1,2};
        System.out.println(mergeAdjacent(arr));
    }
    public static List<Long> mergeAdjacent(int[] nums) {
        List<Long>ans=new ArrayList<>();
        for(int elem:nums){
            long val=(long) elem;
            while (!ans.isEmpty()&&ans.get(ans.size()-1)==val){
                val+=ans.remove(ans.size()-1);
            }
            ans.add(val);
        }
        return ans;
    }
}
