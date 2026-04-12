package TwoPointerSlidingWIndow;

public class BinarySubArrayWithSumGoal {
    public static void main(String[] args) {
        int[]arr={0,0,0,0,0};
        System.out.println(numSubarraysWithSum(arr,0));
    }
    public static int numSubarraysWithSum(int[] nums, int goal) {
        return helper(nums,goal)-helper(nums,goal-1);
    }
    public static int helper(int[]nums,int target){
        if(target<0)return 0;
        int left=0,right=0,sum=0,ans=0;
        while(right<nums.length){
            sum+=nums[right];
            while(sum>target&&left<nums.length){
                sum-=nums[left++];
            }
            ans+=(right-left+1);
            right++;
        }
        return ans;
    }
}
