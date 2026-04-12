package Leetcode.Weekly.Weekly476;

import java.util.Arrays;
public class Q1476 {
    public int maximizeExpressionOfThree(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length-1]+nums[nums.length-2]-nums[0];
    }
}