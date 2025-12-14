package Leetcode.Weekly.Weekly480;

import java.util.Arrays;

public class Q1 {
    public int absDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int n=nums.length;
        int small=0,largest=0;
        for(int i=0;i<k;i++)small+=nums[i];
        for(int i=n-k;i<n;i++)largest+=nums[i];
        return Math.abs(largest-small);
    }
}
