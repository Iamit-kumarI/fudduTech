package NeetCodeSheet.BinarySearch;

public class SearchIn2DMatrix {
    public static void main(String[] args) {
        int[][]arr={
                {1,3,5,7},
                {10,11,16,20},
                {23,30,34,60}
        };
        System.out.println(searchMatrix(arr,3));
    }
    public static boolean searchMatrix(int[][] matrix, int target) {
        for(int[]row:matrix){
            int ans=search(row,target);
            if(ans!=-1)return true;
        }
        return false;
    }
    public static int search(int[] nums, int target) {
        int start=0,end=nums.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target)return mid;
            else if(nums[mid]<target){
                start=mid+1;
            }else end=mid-1;
        }
        return -1;
    }
}
