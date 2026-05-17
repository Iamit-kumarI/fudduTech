package Leetcode.Array;

public class Ltc153 {
    public static void main(String[] args) {
        int[]arr={3,4,5,1,2};
        System.out.println(findMin(arr));
    }
    public static int findMin(int[] nums) {
       int ans=Integer.MAX_VALUE;
       for(int val:nums){
           if(val<ans)ans=val;
       }
       return ans;
    }
}
