package Leetcode.BitManupulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortIntegerByBitCount {
    public static void main(String[] args) {
        int[]arr={1024,512,256,128,64,32,16,8,4,2,1};
        System.out.println(Arrays.toString(sortByBits(arr)));
    }
    public static int[] sortByBits(int[] arr) {
        Arrays.sort(arr);
        List<Integer> list=new ArrayList<>();
        for(int val:arr)list.add(val);
        Collections.sort(list,(a,b)->Integer.bitCount(a)-Integer.bitCount(b));
//        list.sort((a,b)->Integer.bitCount(a)-Integer.bitCount(b));
//        return list.stream().toArray();
        for(int i=0;i<arr.length;i++)arr[i]=list.get(i);
        return arr;
    }
}
