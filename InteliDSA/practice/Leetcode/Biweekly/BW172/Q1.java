package Leetcode.Biweekly.BW172;

import java.util.HashSet;
import java.util.Set;

public class Q1 {
    public int minOperations(int[] nums) {
        int[]freq=new int[100001];
        int duplicateFound=0;
        for(int val:nums){
            freq[val]++;
            if(freq[val]==2)duplicateFound++;
        }
        int ans=0,i=0;
        while(i<nums.length&&duplicateFound>0){
            ans++;
            for(int j=0;j<3&&i<nums.length;j++,i++){
                int val=nums[i];
                if(freq[val]==2)duplicateFound--;
                freq[val]--;
            }
        }
        return ans;
    }
}
