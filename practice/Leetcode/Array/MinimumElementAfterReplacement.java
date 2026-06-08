package Leetcode.Array;

public class MinimumElementAfterReplacement {
    public static void main(String[] args) {
        int[]arr={10,12,13,14};
        System.out.println(minElement(arr));
    }
    public static int minElement(int[] nums) {
        int min=Integer.MAX_VALUE;
        for(int val:nums){
//            int cur=digitSum(val);
            if(val<min)min=val;
        }
        return digitSum(min);
    }
    public static int digitSum(int val){
        int ans=0;
        while(val>0){
            ans+=val%10;
            val/=10;
        }
        return ans;
    }
}
