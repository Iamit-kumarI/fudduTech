package Leetcode.Weekly.Weekly481;

public class Q2 {
    public long minCost(String s, int[] cost) {
        long res=Long.MAX_VALUE;
        for(char ch ='a';ch <='z';ch++){
            long deletecost=0;
            boolean isPresent=false;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)==ch)isPresent=true;
                else deletecost+=cost[i];
            }
            if(isPresent)res=Math.min(res,deletecost);
        }
        return res;
    }
}
