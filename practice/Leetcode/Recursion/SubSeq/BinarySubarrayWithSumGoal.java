package Leetcode.Recursion.SubSeq;

public class BinarySubarrayWithSumGoal {
    public static void main(String[] args) {
        int[]arr={1,0,1,0,1};
        System.out.println(numSubarraysWithSum(arr,2));
    }
    public static int numSubarraysWithSum(int[] nums, int goal) {
        int left=0,right=0,sum=0,count=0;
        while(right<nums.length){
            sum+=nums[right];
            if(sum==goal)count++;
            if(sum>goal){
                while(sum>=goal){
                    sum-=nums[left++];
                    if(sum==goal)count++;
                }
            }
            right++;
        }
        return count;
    }
}
