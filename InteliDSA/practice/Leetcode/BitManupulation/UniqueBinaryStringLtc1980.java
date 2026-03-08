package Leetcode.BitManupulation;

import java.util.HashSet;
import java.util.Set;

public class UniqueBinaryStringLtc1980 {
    public static void main(String[] args) {
        String[]arr={"111","011","011"};
        System.out.println(findDifferentBinaryString(arr));
    }
    public static String findDifferentBinaryString(String[] nums) {
        Set set=helper(nums.length);
        for(String cur:nums){
            set.remove(cur);
        }
        for(Object s:set){
            return s.toString();
        }
        return "1";
    }
    public static Set helper(int n){
        int len=n;
        n=(int)Math.pow(2,n);
        Set<String>set=new HashSet<>();
        for(int i=0;i<n;i++){
            String cur=Integer.toBinaryString(i);
            //check if cru.len <le
            if(cur.length()<len){
                int add=len-cur.length();
                set.add(addZeros(add)+cur);
            }else set.add(cur);
        }
        System.out.println(set);
        return set;
    }
    public static String addZeros(int n){
        StringBuilder sb=new StringBuilder();
        while(n-->0)sb.append("0");
        return sb.toString();
    }
}
