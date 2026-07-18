package Leetcode.Array;

import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {
        int[]arr={0,1,0,3,12};
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void moveZeroes(int[] nums) {
        int zero=0,digit=0,end=nums.length-1;
        while(zero<end&&digit<end){
            if(nums[zero]!=0){
                while(nums[zero]!=0)zero++;
            }
            if(nums[digit]==0){
                while(nums[digit]==0)digit++;
            }
            nums[zero]=nums[digit];
            nums[digit]=0;
        }
    }
}
