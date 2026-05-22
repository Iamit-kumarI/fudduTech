package Leetcode.Array;

public class MinCommonValue {
    public static void main(String[] args) {
        int[]arr1={1,2,3};
        int[]arr2={2,4};
        System.out.println(getCommon(arr1,arr2));
    }
    public static int getCommon(int[] nums1, int[] nums2) {
        int n=nums1.length,m=nums2.length;
        int index1=0,index2=0;
        while(index1<n&&index2<m){
            if(nums1[index1]==nums2[index2])return nums1[index1];
            else if(nums1[index1]>nums2[index2])index2++;
            else index1++;
        }
        return -1;
    }
}
