package Leetcode.Randome.Old;

public class POTD1262 {
    public static void main(String[] args) {
        int[]arr={2,6,2,2,7};
        System.out.println(helper(arr));
    }
//    public static int maxSumDivThree(int[] nums) {
//        int sum=0,max=0;
//        for(int val:nums)sum+=val;
//        if(sum%3==0)return sum;
//        for(int val:nums){
//            if((sum-val)%3==0){
//                max=Math.max(max,sum-val);
//            }
//        }
//        return max;
//    }
    public static int helper(int []nums){
        int[]dp=new int[3];
        dp[0]=0;
        dp[1]=Integer.MIN_VALUE;
        dp[2]=dp[1];
        for(int val:nums){
            int[]curr=dp.clone();
            for(int i=0;i<3;i++){
                int rem=(i+val)%3;
                curr[rem]=Math.max(curr[rem],dp[i]+val);
            }
            dp=curr;
        }
        return dp[0];
    }
}
