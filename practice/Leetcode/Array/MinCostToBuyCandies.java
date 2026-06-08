package Leetcode.Array;

import java.util.Arrays;

public class MinCostToBuyCandies {
    public static void main(String[] args) {
        int[]arr={6,5,7,9,2,2};
        System.out.println(minimumCost(arr));
    }
    public static int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int ans=0,len=cost.length-1;
        while(len>=0){
            ans+=cost[len];
            if(len-1>0){
                ans+=cost[len-1];
                len--;
            }
            len-=2;
        }
        return ans;
    }
}
