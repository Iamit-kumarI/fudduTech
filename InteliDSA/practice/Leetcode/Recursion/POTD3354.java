package Leetcode.Recursion;

public class POTD3354 {
    public static void main(String[] args) {
        int []nums={1,0,2,0,3};
        System.out.println(countValidSelections(nums));
    }
    public static int countValidSelections(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) {
                count+= helper(nums, i,-1);
                count+=helper(nums,i,1);
            }
        }
        return count;
    }
    public static int helper(int []nums,int curr,int dir){
        if(curr>=nums.length||curr<0){
            for(int val:nums)if(val!=0)return 0;
            return 1;
        }
        if(nums[curr]==0) return helper(nums,curr+dir,dir);
        if(nums[curr]>0){
            nums[curr]--;
            dir=-dir;
            return helper(nums,curr+dir,dir);
        }
        return 0;
    }
}
