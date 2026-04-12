package NeetCodeSheet.SlidingWindow;

public class NoOfNiceSubArray {
    public static void main(String[] args) {
        int[]arr={1,1,2,1,1};
        System.out.println(numberOfSubarrays(arr,3));
    }
    public static int numberOfSubarrays(int[] nums, int k) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2!=0)nums[i]=1;
            else nums[i]=0;
        }
        return helper(nums,k)-helper(nums,k-1);
    }
    public static int helper(int[]arr,int target){
        if(target==0)return 0;
        int left=0,right=0,ans=0,sum=0;
        while(right<arr.length){
            sum+=arr[right];
            while(sum>target&&left<arr.length){
                sum-=arr[left++];
            }
            ans+=(right-left+1);
            right++;
        }
        return ans;
    }
}
