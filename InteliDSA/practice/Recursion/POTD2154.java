package Recursion;

public class POTD2154 {
    public static void main(String[] args) {
        int []arr={5,3,6,1,12};
        System.out.println(findFinalValue(arr,3));
    }
    public static int findFinalValue(int[] nums, int original) {
        if(search(nums,original)){
            return findFinalValue(nums,original*2);
        }
        return original;
//        return search(nums,original)?findFinalValue(nums,original*2):original;
    }
    public static boolean search(int []nums,int target){
        for(int val:nums){
            if(val==target)return true;
        }
        return false;
    }
}