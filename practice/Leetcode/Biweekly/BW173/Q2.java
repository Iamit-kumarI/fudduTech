package Leetcode.Biweekly.BW173;

import java.util.HashMap;
import java.util.Map;

public class Q2 {
    public int minLength(int[] nums, int k) {
        int len= nums.length;
        Map<Integer,Integer> map=new HashMap<>();
        int left=0,dis=0,minLen=Integer.MAX_VALUE;
        for(int i=0;i<len;i++){
            int cur=nums[i];
            map.put(cur,map.getOrDefault(cur,0)+1);
            if(map.get(cur)==1)dis+=cur;
            while(dis>k){
                minLen=Math.min(minLen,i-left+1);
                int leftnum=nums[left];
                map.put(leftnum,map.get(leftnum)-1);
                if(map.get(leftnum)==0){
                    dis-=leftnum;
                    map.remove(leftnum);
                }
                left++;
            }
        }
        return minLen==Integer.MAX_VALUE?-1:minLen;
    }
}
