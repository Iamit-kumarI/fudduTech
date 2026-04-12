package Leetcode.Weekly.Weekly482;

public class Q2 {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        if(need2==0&&need1==0)return 0L;
        Long res=Long.MAX_VALUE;
        long[]arr={0L,Math.min(need1,need2),need1,need2};
        for(long value:arr){
            if(value<0)continue;
            long r1=Math.max(0L,(long)need1-value);
            long r2=Math.max(0L,(long)need2-value);
            long newcost=value*costBoth+r1*cost1+r2*cost2;
            res=Math.min(res,newcost);
        }
        return res;
    }
}
