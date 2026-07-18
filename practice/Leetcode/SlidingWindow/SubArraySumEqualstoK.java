package Leetcode.SlidingWindow;

public class SubArraySumEqualstoK {
    public static void main(String[] args) {
        int[]arr={1,1,1};
        System.out.println(subarraySum(arr,2));
    }
    public static int subarraySum(int[] nums, int k) {
        int start=0,curStart=0,sum=0,n=nums.length,ans=0;
        while(start<n||curStart<n){
            if(curStart<n&&sum<k){
                sum+=nums[curStart++];
                if(sum==k)ans++;
            }
            else if(start<n&&sum>=k){
                while(start<n&&sum>=k){
                    sum-=nums[start++];
                    if(sum==k)ans++;
                }
            }else break;
        }
        return ans;
    }
}
