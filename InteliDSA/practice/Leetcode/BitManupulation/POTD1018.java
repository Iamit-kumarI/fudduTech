package Leetcode.BitManupulation;

import java.util.ArrayList;
import java.util.List;

public class POTD1018 {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> list=new ArrayList<>();
        int val=0;
        for(int num:nums){
            val=(val*2+num)%5;
            list.add(val==0);
        }
        return list;
    }
}
