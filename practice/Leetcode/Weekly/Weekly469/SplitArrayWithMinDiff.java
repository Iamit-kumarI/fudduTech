package Leetcode.Weekly.Weekly469;

import java.util.Arrays;

public class SplitArrayWithMinDiff {
    public static void main(String[] args) {
        int []array={1,3,2};
        System.out.println(splitArray(array));
    }
    public static long splitArray(int[] nums) {
        long abssum=Long.MAX_VALUE;
        int len=nums.length;
        for(int i=0;i<len-1;i++){
            int []leftside=Arrays.copyOfRange(nums,0,i+1);
            int []rightside=Arrays.copyOfRange(nums,i+1,len);
            if(isIncreasing(leftside)&&isDecresing(rightside)){
                int leftsum=sum(leftside);
                int rightsum=sum(rightside);
//                if(leftsum>rightsum)abssum =leftsum;
//                if(rightsum>leftsum)abssum =rightsum;
                long diff=Math.abs(leftsum-rightsum);
                abssum=Math.min(abssum,diff);
            }
        }
        return abssum==Long.MAX_VALUE?-1:abssum;
    }
    public static int sum(int []arr){
        int sum=0;
        for(long num:arr){
            sum+=num;
        }
        return sum;
    }
    public static boolean isIncreasing(int[]left){
        for(int i=1;i<left.length;i++){
            if(left[i-1]>=left[i])return false;
        }
        return true;
    }
    public static boolean isDecresing(int []right){
        for(int i=1;i<right.length;i++){
            if(right[i-1]<=right[i])return false;
        }
        return true;
    }

}
