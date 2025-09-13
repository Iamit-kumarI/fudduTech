package Leetcode.Randome.SlidingWindow;

public class Ltc209 {
    public static void main(String[] args) {
        int []nums={2,3,1,2,4,3};
        System.out.println(minSubArrayLen(7,nums));
    }
    public static int minSubArrayLen(int target, int[] nums) {
        if(nums.length==0||target==0){
            return 0;
        }
        int sum=0,minlen=Integer.MAX_VALUE,left=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            while(sum>=target){
                    minlen=Math.min(minlen,i-left+1);
                    sum=sum-nums[left];
                    left++;
            }
        }
        return minlen;
    }
}
