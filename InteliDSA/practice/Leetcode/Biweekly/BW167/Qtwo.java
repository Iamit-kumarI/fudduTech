package Leetcode.Biweekly.BW167;

public class Qtwo {
    public static void main(String[] args) {
        int []arr={1,1,1,1,2,3,5,1};
        System.out.println(longestSubarray(arr));
    }
    public static int longestSubarray(int[] nums) {
        int len=nums.length;
        if(len<3)return len;
        int maxLen=2;
        int currentLen=2;
        for(int i=2;i<len;i++){
            if(nums[i]==nums[i-2]+nums[i-1]){
                currentLen++;
            }else{
                currentLen=2;
            }
            maxLen=Math.max(maxLen,currentLen);
        }
        return maxLen;
    }
}
