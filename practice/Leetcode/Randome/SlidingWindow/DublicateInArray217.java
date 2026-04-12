package Leetcode.Randome.SlidingWindow;

import java.util.ArrayList;
import java.util.Arrays;

public class DublicateInArray217 {
    public static void main(String[] args) {
        int[]nums={1,2,3,1};
        System.out.println(containsDuplicate(nums));
    }
    static boolean containsDuplicate(int[] nums) {
        int max=0;
        ArrayList<Boolean> list=new ArrayList<>();
        //we need to add false in the list first
        //find the max element it the list
        for(int num:nums){
            if(num>max){
                max=num;
            }
        }
        //now add false in list
        for (int i = 0; i <= max; i++) {
            list.add(false);
        }
        //now just add true at the index in list and if there is true already then
        // it means dublicate find just return true
        for(int i=0;i<nums.length;i++){
            if(list.get(nums[i])) {
                return true;
            }
            list.set(nums[i], true);
        }
        return false;
    }
}
