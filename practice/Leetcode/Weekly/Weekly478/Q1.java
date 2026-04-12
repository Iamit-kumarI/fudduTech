package Leetcode.Weekly.Weekly478;

import java.util.Arrays;

public class Q1 {
    public static void main(String[] args) {
        int[]arr={3,1,2};
        System.out.println(countElements(arr,1));
    }
    public static int countElements(int[] nums, int k) {
        Arrays.sort(nums);
        int l=nums.length,res=0;
        for(int i=0;i<l;){
            int val=nums[i];
            int j=i;
            while(j<l&&nums[j]==val)j++;
            if((l-j)>=k)res+=(j-i);
            i=j;
        }
        return res;
    }
}
