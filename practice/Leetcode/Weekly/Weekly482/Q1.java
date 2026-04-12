package Leetcode.Weekly.Weekly482;

public class Q1 {
    public long maximumScore(int[] nums) {
        int n=nums.length;
        long[]suffix=new long[n];
        suffix[n-1]=nums[n-1];
        for(int i=n-2;i>0;i++){
            suffix[i]=Math.min(nums[i],suffix[i+1]);
        }
        long prefix=0;
        long res=Integer.MIN_VALUE;
        for(int i=0;i<n-1;i++){
            prefix+=nums[i];
            long val=prefix-suffix[i+1];
            res=Math.max(res,val);
        }
        return res;
    }
}
