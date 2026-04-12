package Leetcode.Randome.Old;

import java.util.ArrayList;
import java.util.Arrays;

public class Ltc80 {
    public static void main(String[] args) {
        int[]arr={1,1,1,2,2,2,2,2,3};
        System.out.println(removeDuplicates(arr));
    }
    public static int removeDuplicates(int[] nums) {
        if(nums.length<=2)return nums.length;
        int j=2;
        for(int i=2;i<nums.length;i++){
            if(nums[i]!=nums[j-2]){
                nums[j++]=nums[i];
            }
        }
        return j;
    }
}
