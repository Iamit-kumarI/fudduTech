package Leetcode.Math.GCD;

import java.util.Stack;

public class POTDTronicArray {
    public static void main(String[] args) {
        int[]arr={1,6,6,3,7};
        System.out.println(isTrionic(arr));
    }
    public static boolean isTrionic(int[] nums) {
        if(nums.length<=3)return false;
        int count=0,i=1;
        while (i<nums.length){
            if(count==0&&nums[i]<nums[i-1])return false;
            if(nums[i]>nums[i-1]){
                if(count==0)count++;
            }
            if(nums[i]==nums[i-1])return false;
            if(count==1&&nums[i]<nums[i-1])break;
            i++;
        }
        while(i<nums.length){
            if(nums[i]<nums[i-1]){
                if(count==1)count++;
            }
            if(nums[i]==nums[i-1])return false;
            if(count==2&&nums[i]>nums[i-1])break;
            i++;
        }
        while (i<nums.length){
            if(count==3&&nums[i]<nums[i-1])return false;
            if(nums[i]>nums[i-1]){
                if(count==2)count++;
            }
            if(nums[i]==nums[i-1])return false;
            if(count==3&&nums[i]<nums[i-1])break;
            i++;
        }
        return count==3;
    }
}
