package Leetcode.Biweekly.BW174;

import java.util.HashSet;
import java.util.Set;

public class Q2 {
    public int minOperations(int[] nums, int[] target) {
        int len=nums.length;
        Set<Integer> changes=new HashSet<>();
        for(int i=0;i<len;i++){
            if(nums[i]!=target[i]){
                changes.add(nums[i]);//changes
            }
        }
        return changes.size();
    }
}
