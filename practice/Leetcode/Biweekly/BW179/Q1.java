package Leetcode.Biweekly.BW179;

public class Q1 {
    public static void main(String[] args) {
        int[]arr={2,1};
        System.out.println(minAbsoluteDifference(arr));
    }
    public static int minAbsoluteDifference(int[] nums) {
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==1&&nums[j]==2)ans=Math.min(ans,Math.abs(i-j));
            }
        }
        return ans==Integer.MAX_VALUE?-1:ans-1;
    }
}
