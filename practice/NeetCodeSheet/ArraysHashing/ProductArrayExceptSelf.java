package NeetCodeSheet.ArraysHashing;

import java.util.ArrayList;
import java.util.Arrays;

public class ProductArrayExceptSelf {
    public static void main(String[] args) {
        int[]arr={1,0,3,0};
        System.out.println(Arrays.toString(productExceptSelf(arr)));
    }
    public static int[] productExceptSelf(int[] nums) {
        int mul=1,noOfZeros=0;
        for(int val:nums){
            if(val==0)noOfZeros++;
            else{
                mul*=val;
            }
            if(noOfZeros==2){
                Arrays.fill(nums,0);
                return nums;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                Arrays.fill(nums,0);
                nums[i]=mul;
                return nums;
            }
            else{
                nums[i]=mul/nums[i];
            }
        }
        return nums;
    }
}
