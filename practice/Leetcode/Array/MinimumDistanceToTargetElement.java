package Leetcode.Array;

public class MinimumDistanceToTargetElement {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5};
        System.out.println(getMinDistance(arr,5,3));
    }
    public static int getMinDistance(int[] nums, int target, int start) {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                min=Math.min(min,Math.abs(i-start));
            }
        }
        return min;
    }
}
