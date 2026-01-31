package NeetCodeSheet.BinarySearch;

public class MinimumInRotatedSortedArray {
    public static void main(String[] args) {
        int[]arr={4,5,6,7,0,1,2};
        System.out.println(findMin(arr));
    }
    public static int findMin(int[] nums) {
        int start=0,end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]>nums[end])start=mid+1;
            else end=mid-1;
        }
        return nums[start];
    }
}
