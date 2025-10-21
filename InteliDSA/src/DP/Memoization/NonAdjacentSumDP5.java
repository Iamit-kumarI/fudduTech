package DP.Memoization;

import java.util.ArrayList;
import java.util.Collections;

public class NonAdjacentSumDP5 {
    public static int maximumNonAdjacentSum(ArrayList<Integer> nums) {
        int len=nums.size();
        ArrayList<Integer>list=new ArrayList<>(Collections.nCopies(len+1,-1));
        return function(len-1,nums,list);
    }
    public static int function(int index, ArrayList<Integer> nums,ArrayList<Integer> dp){
        if(index==0)return nums.get(index);
        if(index<0)return 0;
        if(dp.get(index)!=-1)return dp.get(index);
        int takeit=nums.get(index)+function(index-2,nums,dp);
        int ignoreit=0+function(index-1,nums,dp);
        int ans=Math.max(takeit,ignoreit);
        dp.set(index,ans);
        return ans;
    }
}
