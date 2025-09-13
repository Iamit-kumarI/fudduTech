package Leetcode.Randome.Old;

public class Ltc81 {

    public static void main(String[] args) {
        int []arr={1,0,1,1,1};
        System.out.println(search(arr,0));
    }
    static boolean search(int[] nums, int target) {
        return helper(nums,target,0,nums.length-1);
    }
    static boolean helper(int []nums,int target,int s,int e){
        if(s>e){
            return false;
        }
        int mid=s+(e-s)/2;
        if(nums[mid]==target){
            return true;
        }
        if (nums[s] == nums[mid] && nums[mid] == nums[e]) {
            return helper(nums, target, s + 1, e - 1);
        }
        if(nums[s]<=nums[mid]){
            if(target>=nums[s]&&target<=nums[mid]){
                return helper(nums,target,s,mid-1);
            }else{
                return helper(nums,target,mid+1,e);
            }
        }
        if(target>=nums[mid]&&target<=nums[e]){
            return helper(nums,target,mid+1,e);
        }
        return helper(nums,target,s,mid-1);
    }
}
