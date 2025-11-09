package Leetcode.Biweekly.BW169;

import java.util.HashMap;
import java.util.Map;

public class Q2 {
    public int countMajoritySubarrays(int[] nums, int target) {
        int []arr=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                arr[i]=1;
            }else{
                arr[i]=-1;
            }
        }
        int ans=0;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
                sum+=arr[j];
                if(sum>0)ans++;
            }
        }
        return ans;
    }
}