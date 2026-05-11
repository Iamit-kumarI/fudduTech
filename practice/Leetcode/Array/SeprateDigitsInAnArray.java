package Leetcode.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SeprateDigitsInAnArray {
    public static void main(String[] args) {
        int[]arr={13,25,83,77};
        System.out.println(Arrays.toString(separateDigits(arr)));
    }
    public static int[] separateDigits(int[] nums) {
        List<Integer>ans=new ArrayList<>();
        for(int val:nums){
            List<Integer>cur=new ArrayList<>();
            while(val>0){
                cur.add(val%10);
                val/=10;
            }
            ans.addAll(cur.reversed());
        }
        return ans.stream().mapToInt(Integer::intValue).toArray();
    }
}
