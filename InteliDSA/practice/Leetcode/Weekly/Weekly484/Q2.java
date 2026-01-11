package Leetcode.Weekly.Weekly484;

import java.util.HashSet;

public class Q2 {
    public int centeredSubarrays(int[] nums) {
        int len=nums.length;
        int ans=0;
        for(int i=0;i<len;i++){
            int sum=0;
            HashSet<Integer>set=new HashSet<>();
            for(int i1=1;i1<len;i1++){
                sum+=nums[i1];
                set.add(nums[i1]);
                if(set.contains(sum)){
                    ans++;
                }
            }
        }
        return ans;
    }
}
