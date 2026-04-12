package NeetCodeSheet.SlidingWindow;

public class SubArrayProductLessThanK {
    public static void main(String[] args) {
        int[]arr={10,5,2,6};
        System.out.println(numSubarrayProductLessThanK(arr,100));
    }
    public static int numSubarrayProductLessThanK(int[] nums, int k) {
        int left=0,right=0,ans=0;
        for(int i=0;i<nums.length;i++){
            int product=nums[i];
            for(int j=i+1;j<nums.length;j++){
                product*=nums[j];
                if(product>=k)break;
                ans++;
            }
        }
        return ans==0?0:ans+nums.length;
    }
}
