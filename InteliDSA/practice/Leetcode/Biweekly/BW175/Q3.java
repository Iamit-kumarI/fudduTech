package Leetcode.Biweekly.BW175;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Q3 {
    public static void main(String[] args) {
        int[]arr={2,3,6};
        System.out.println(longestSubsequence(arr));
    }
    public static int longestSubsequence(int[] nums) {
        int ans=0,n=nums.length;
        for(int bit=0;bit<31;bit++){
            int[]cur=new int[n];
            int len=0;
            for(int elem:nums){
                if(elem==0||(elem&(1<<bit))==0){
                    continue;
                }
                int pos= Arrays.binarySearch(cur,0,len,elem);
                if(pos<0){
                    pos=pos+1;
                }
                cur[pos]=elem;
                if(pos==len)len++;
            }
            ans=Math.max(ans,len);
        }
        return ans;
    }
}

