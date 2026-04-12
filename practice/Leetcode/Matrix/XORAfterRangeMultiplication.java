package Leetcode.Matrix;

public class XORAfterRangeMultiplication {
    public static void main(String[] args) {
        int[]arr={2,3,1,5,4};
        int[][]queries={
                {1,4,2,3},
                {0,2,1,2}
        };
        System.out.println(xorAfterQueries(arr,queries));
    }
    public static int xorAfterQueries(int[] nums, int[][] queries) {
        for(int[]row:queries){
            helper(nums,row);
        }
        int xor=0;
        for(int val:nums)xor^=val;
        return xor;
    }
    public static void helper(int[]nums,int []query){
        int mod=1000000007;
        int idx=query[0],ri=query[1],vi=query[2],ki=query[3];
        while(idx<=ri&&idx<nums.length){
            nums[idx]=(nums[idx]*vi)%mod;
            nums[idx]+=ki;
            idx++;
        }
    }
}
