package Leetcode.Math;

import java.util.Arrays;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        int[]arr={2,5,6,9,10};
        System.out.println(findGCD(arr));
    }
    public static int findGCD(int[] nums) {
        Arrays.sort(nums);
        return gcd(nums[0],nums[nums.length-1]);
    }
    public static int gcd(int a,int b){
        if(b==0)return a;
        return gcd(b,a%b);
    }
}
