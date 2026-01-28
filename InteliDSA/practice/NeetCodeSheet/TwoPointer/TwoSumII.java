package NeetCodeSheet.TwoPointer;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TwoSumII {
    public static void main(String[] args) {
        int[]arr={2,7,11,15};
        System.out.println(Arrays.toString(twoSum(arr,9)));
    }
    public static int[] twoSum(int[] numbers, int target) {
        int start=0,end=numbers.length-1;
        while(start<end){
            if(numbers[start]+numbers[end]==target)return new int[]{start+1,end+1};
            if(numbers[start]+numbers[end]>target)end--;
            if(numbers[start]+numbers[end]<target)start++;
        }
        return new int[]{-1,-1};
    }
}
