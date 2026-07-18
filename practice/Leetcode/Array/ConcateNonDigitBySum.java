package Leetcode.Array;

import java.util.Arrays;

public class ConcateNonDigitBySum {
    static int mod=1000000007;
    public static void main(String[] args) {
        String s="10203004";
        int[][]arr={
                {0,7},
                {1,3},
                {4,6}
        };
        System.out.println(Arrays.toString(sumAndMultiply(s,arr)));
    }
    public static int[] sumAndMultiply(String s, int[][] queries) {
        int[]ans=new int[queries.length];
        int index=0;
        for(int[]row:queries){
            String str=s.substring(row[0],row[1]+1);
            ans[index++]=helper(str);
        }
        return ans;
    }
    public static int helper(String s) {
        long no=0,sum=0,len=1;
        for(int i=s.length()-1;i>=0;i--){
            int rem=s.charAt(i)-'0';
            if(rem!=0){
                no=(no+rem*len)%mod;
                sum+=rem;
                sum%=mod;
                len=(len*10)%mod;
            }
        }
        return (int)((no*sum)%mod);
    }
}
