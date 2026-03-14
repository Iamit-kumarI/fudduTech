package Leetcode.Biweekly.BW178;

import java.util.Arrays;

public class Q2 {
    public long gcdSum(int[] nums) {
        int n=nums.length;
        int[]prefix=new int[n];
        int max=0;
        for(int i=0;i<n;i++){
            max=Math.max(max,nums[i]);
            nums[i]=gcd(nums[i],max);
        }
        Arrays.sort(nums);
        int start=0,end=n-1;
        long ans=0;
        while (start<end){
            ans+=(gcd(nums[start++],nums[end--]));
        }
        return (int)ans;
    }
    public int gcd(int a,int b){
        if(b==0)return a;
        return gcd(b,a%b);
    }
}
