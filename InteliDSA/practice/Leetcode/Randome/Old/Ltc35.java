package Leetcode.Randome.Old;

public class Ltc35 {
    public static void main(String[] args) {
        int []nums={1,3,5,6};
        System.out.println(searchInsert(nums,5));
    }
    public static int searchInsert(int[] nums, int target) {
        int s=0,e=nums.length-1;
        int mid=0;
        while(s<=e){
            mid=s+(e-s)/2;
            if(nums[mid]==target)return mid;
            else if (nums[mid]<target) {
                s=mid+1;
            }else{
                e=mid-1;
            }
        }
        return mid;
    }
}
