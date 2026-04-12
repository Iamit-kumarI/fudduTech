package NeetCodeSheet.SlidingWindow;

public class MaximumAvgSubArray {
    public static void main(String[] args) {
        int[]arr={1,12,-5,-6,50,3};
        System.out.println(findMaxAverage(arr,4));
    }
    public static double findMaxAverage(int[] nums, int k) {
        double max=Double.MIN_VALUE,sum=0;
        if(nums.length==1)return (double) nums[0];
        int left=0,right=k;
        while(right<nums.length){
            if(right-left<k){
                sum+=nums[right++];
                continue;
            }
            else{
                sum=sum-nums[left++]+nums[right++];
            }
            max=Math.max(max,sum/k);
        }
        return max;
    }
}
