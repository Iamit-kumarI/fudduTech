package Leetcode.Array;

import java.util.Arrays;

public class PartitionArrayAccordingtToPivot {
    public static void main(String[] args) {
        int[]arr={9,12,5,10,14,3,10};
        System.out.println(Arrays.toString(pivotArray(arr,10)));
    }
    public static int[] pivotArray(int[] nums, int pivot) {
        int n=nums.length;
        int[]arr=new int[n];
        int index=0;
        for(int val:nums){
            if(val<pivot)arr[index++]=val;
        }
        for(int val:nums){
            if(val==pivot)arr[index++]=val;
        }
        for(int val:nums){
            if(val>pivot)arr[index++]=val;
        }
        return arr;
    }
}
