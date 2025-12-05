package Leetcode.Math;

public class POTD3432 {
    public static void main(String[] args) {
        int[]nums={2,4,6,8};
        System.out.println(countPartitions(nums));
    }
    public static int countPartitions(int[] nums) {
        int sum=0;
        for(int val:nums)sum+=val;
        int count=0,leftSum=0,index=0;
        for(int i=0;i<nums.length-1;i++){
            leftSum+=nums[i];
            sum-=nums[i];
//            if(sum%2==0&&leftSum%2==0)count++;
            if((sum&1)==(leftSum&1))count++;
        }
        return count;
    }
}
