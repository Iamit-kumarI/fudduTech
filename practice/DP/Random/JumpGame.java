package DP.Random;

public class JumpGame {
    public static void main(String[] args) {
        int[]arr={3,2,1,0,4};
        System.out.println(canJump(arr));
    }
    public static boolean canJump(int[] nums) {
        int next=nums[0];
        for(int i=0;next<nums.length&&i<nums.length;i++){
            next+=nums[next];
        }
        return next-nums[nums.length-1]==nums.length-1;
    }
}
