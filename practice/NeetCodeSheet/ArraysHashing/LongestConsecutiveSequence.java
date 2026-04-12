package NeetCodeSheet.ArraysHashing;

import java.util.Arrays;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[]arr={1,2,6,7,8};
        System.out.println(longestConsecutive(arr));
    }
    public static int longestConsecutive(int[] nums) {
        if(nums.length<1)return 0;
        Arrays.sort(nums);
        int max=1,curMax=1,last=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]==last+1){
                curMax++;
            }else if(nums[i]==last){
                continue;
            }
            max=Math.max(max,curMax);
            if(nums[i]!=last+1)curMax=1;
            last=nums[i];
        }
        return max;
    }
}
