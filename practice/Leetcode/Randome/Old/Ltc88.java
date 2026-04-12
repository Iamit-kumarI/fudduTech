package Leetcode.Randome.Old;

import java.util.Arrays;

//megr sorted array in nums1 it has already leangth of both size m&n
public class Ltc88 {
    public static void main(String[] args) {
        int []nums1={1,2,3,0,0,0};
        int []nums2={2,5,6};
        int m=3,n=0;
        merge(nums1,m,0,nums2,n);
    }
    public static void merge(int[] nums1, int len,int m, int[] nums2, int n) {
    while(m<nums1.length&&n<nums2.length){
        if(nums1[m]>nums2[n]){
            int temp=nums1[m];
            nums1[m]=nums2[n];
            nums1[m+1]=temp;
            m++;
            n++;
        }else{
            int temp=nums2[n];
            nums2[n]=nums1[m];
            n++;
        }
    }
    if(n<nums2.length){
        nums1[n]=nums2[n];
        n++;

    }
        System.out.println(Arrays.toString(nums1));
    }
}
