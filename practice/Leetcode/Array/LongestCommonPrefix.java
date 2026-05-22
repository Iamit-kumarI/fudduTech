package Leetcode.Array;

import java.util.HashSet;
import java.util.Set;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        int[]arr1={1,10,100};
        int[]arr2={1000};
        System.out.println(longestCommonPrefix(arr1,arr2));
    }
    public static int longestCommonPrefix(int[] arr1, int[] arr2) {
        Set<String> set1=new HashSet<>();
        Set<String> set2=new HashSet<>();
        for(int val:arr1)set1.add(String.valueOf(val));
        for(int val:arr2)set2.add(String.valueOf(val));
        int ans=0;
        for(int val:arr1){
            for(String cur:set2){
                if(cur.contains(String.valueOf(val))){
                    int curLen=intlength(val);
                    if(curLen>ans)ans=curLen;
                }
            }
        }
        for(int val:arr2){
            for(String cur:set1){
                if(cur.contains(String.valueOf(val))){
                    int curLen=intlength(val);
                    if(curLen>ans)ans=curLen;
                }
            }
        }
        return ans==0?0:ans;
    }
    public static int intlength(int val){
        String cur=String.valueOf(val);
        return cur.length();
    }
}
