package Leetcode.Biweekly.BW169;

public class Q1 {
    public int minMoves(int[] nums) {
        int max=0;
        for(int val:nums)if(val>max)max=val;
        int ans=0;
        for(int val:nums)ans+=(max-val);
        return ans;
    }
}
