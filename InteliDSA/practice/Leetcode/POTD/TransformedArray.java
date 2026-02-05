package Leetcode.POTD;

import java.util.Arrays;

public class TransformedArray {
    public static void main(String[] args) {
        int[]arr={3,-2,1,1};
        System.out.println(Arrays.toString(constructTransformedArray(arr)));
    }
    public static int[] constructTransformedArray(int[] nums) {
        int n=nums.length;
        int[]ans=new int[n];
        for(int i=0;i<n;i++){
            int newIndex=(i+nums[i])%n;
            if(newIndex<0)newIndex+=n;
            ans[i]=nums[newIndex];
        }
        return ans;
    }
}
