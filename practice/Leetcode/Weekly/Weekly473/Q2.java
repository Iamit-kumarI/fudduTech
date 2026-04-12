package Leetcode.Weekly.Weekly473;

import java.util.*;

public class Q2 {
    public static void main(String[] args) {
        int []nums={1,2,3};
        System.out.println(maxAlternatingSum(nums));
    }
    public static long maxAlternatingSum(int[] nums) {
        int len=nums.length;
//        Arrays.sort(nums);
        Integer[]arr=new Integer[len];
        for(int i=0;i<len;i++)arr[i]=nums[i];
        Arrays.sort(arr,(x,y)->Integer.compare(Math.abs(y),Math.abs(x)));
//        Arrays.sort(arr, Comparator.comparingInt(Math::abs).reversed());
        Long sum=0L;
        int evenodd=(len+1)/2;
        for(int i=0;i<len;i++){
            long sq=1L*+arr[i]*arr[i];
            if(i<evenodd)sum+=sq;
            else sum-=sq;
        }
        return sum;
    }
}
