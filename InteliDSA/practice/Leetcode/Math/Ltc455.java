package Leetcode.Math;

import java.util.Arrays;

public class Ltc455 {
    public static void main(String[] args) {
        int[]arr={1,2,3};
        int[]arr1={1,1};
        System.out.println(findContentChildren(arr,arr1));
    }
    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int ans=0;
        int minlen=Math.min(g.length,s.length);
        for(int i=0;i<minlen;i++){
            if(g[i]<=s[i])ans++;
        }
        return ans;
    }
}
