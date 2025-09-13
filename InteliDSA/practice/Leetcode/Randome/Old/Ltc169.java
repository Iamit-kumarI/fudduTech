package Leetcode.Randome.Old;

public class Ltc169 {
    public static void main(String[] args) {
        int[] nums = {3,2,3};
        System.out.println(majorityElement(nums));
    }

    public static int majorityElement(int[] nums) {
        int[] arr = new int[nums.length];
        return helper(nums, arr);
    }

    public static int helper(int[] nums, int[] arr) {
        for (int i = 0; i < nums.length; i++) {
            if (arr[nums[i]] > nums.length / 2) {
                return arr[nums[i]];
            }
            arr[nums[i]] += 1;
        }
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i>0&&arr[i - 1] > arr[i]) {
                max=i-1;
            }

        }
        return max;
    }
}
